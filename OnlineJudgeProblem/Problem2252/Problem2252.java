import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem2252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		Map<Integer, List<Integer>> map = new HashMap<>();
		while(m-->0){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(map.containsKey(a)){
				map.get(a).add(b);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			}
			arr[b-1] += 1;
		}
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0 ; i < n; i++) 
			if(arr[i]==0) queue.add(i+1);
		while(!queue.isEmpty()){
			int i = queue.poll();
			sb.append(i + " ");
			
			if(map.containsKey(i)){
				List<Integer> list = map.get(i);
				for(int j : list){
					arr[j-1]--;
					if(arr[j-1] == 0){
						queue.add(j);
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
