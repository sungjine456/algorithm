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

public class Problem1753 {
	static class Node{
		int i;
		int val;
		Node(int i, int val){
			this.i = i;
			this.val = val;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(br.readLine());
		int[] arr = new int[v];
		boolean[] visit = new boolean[v];
		int max = Integer.MAX_VALUE;
		for(int i = 0; i < v; i++){
			arr[i] = max;
		}
		arr[s-1] = 0;
		Map<Integer,List<Node>> map = new HashMap<>();
		PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.val-o2.val;
			}
		});
		queue.add(new Node(s, 0));
		while(e-->0){
			st = new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			int i = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)){
				map.get(key).add(new Node(i, val));
			} else {
				List<Node> list = new ArrayList<>();
				list.add(new Node(i, val));
				map.put(key, list);
			}
		}
		while(!queue.isEmpty()){
			Node snode = queue.poll();
			int a = snode.i;
			if(map.containsKey(a)&&!visit[a-1]){
				visit[a-1] = true;
				List<Node> nodes = map.get(a);
				for(Node node : nodes){
					int i = node.i;
					if(arr[i-1]>arr[a-1]+node.val){
						arr[i-1] = arr[a-1]+node.val;
						queue.add(new Node(i,arr[i-1]));
					}
				}
			}
		}
		for(int i : arr){
			if(i!=max){
				sb.append(i+"\n");
			} else {
				sb.append("INF\n");
			}
		}
		System.out.print(sb.toString());
	}
}
