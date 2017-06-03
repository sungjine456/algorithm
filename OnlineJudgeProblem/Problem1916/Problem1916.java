import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Problem1916 {
	static class Node{
		int a;
		int val;
		Node(int a, int val){
			this.a = a;
			this.val = val;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		boolean[] visit = new boolean[n+1];
		int max = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++){
			arr[i] = max;
		}
		Map<Integer,List<Node>> map = new HashMap<>();
		for(int i = 0; i < m; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			if(map.containsKey(start)){
				map.get(start).add(new Node(end, cost));
			} else {
				List<Node> list = new ArrayList<>();
				list.add(new Node(end, cost));
				map.put(start, list);
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.val-o2.val;
			}
		});
		queue.add(new Node(a, 0));
		arr[a] = 0;
		while(!queue.isEmpty()){
			Node qnode = queue.poll();
			int x = qnode.a;
			if(map.containsKey(x)&&!visit[x]){
				visit[x] = true;
				List<Node> nodes = map.get(x);
				for(Node node : nodes){
					int i = node.a;
					if(arr[i]>arr[x]+node.val){
						arr[i] = arr[x]+node.val;
						queue.add(new Node(i,arr[i]));
					}
				}
			}
		}
		System.out.println(arr[b]);
	}
}
