import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Problem1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for(int i = 1; i <= n; i++){
			deque.add(i);
		}
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			int getNum = deque.getFirst();
			int j = find(deque, num);
			int size = deque.size();
			while(getNum != num){
				if(j <= size / 2){
					deque.addLast(deque.pollFirst());
				} else {
					deque.addFirst(deque.pollLast());
				}
				getNum = deque.getFirst();
				count++;
			}
			deque.poll();
		}
		System.out.println(count);
	}
	static int find(Deque<Integer> deque, int num){
		Iterator<Integer> iter = deque.iterator();
		int i = 0;
		while(iter.hasNext()){
			if(num == iter.next()){
				return i;
			}
			i++;
		}
		return -1;
	}
}
