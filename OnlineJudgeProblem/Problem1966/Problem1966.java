import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1966 {
	static class Pair{
		int a;
		int index;
		Pair(int a, int index){
			this.a = a;
			this.index = index;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int count = 0;
			Queue<Pair> queue = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++){
				int a = Integer.parseInt(st.nextToken());
				queue.add(new Pair(a,i==m?1:0));
				pq.add(a);
			}
			while(true){
				Pair a = queue.poll();
				int b = pq.peek();
				if(a.a==b){
					count++;
					if(a.index==1){
						break;
					}
					pq.poll();
					continue;
				}
				queue.add(a);
			}
			sb.append(count + "\n");
		}
		System.out.println(sb.toString());
	}
}
