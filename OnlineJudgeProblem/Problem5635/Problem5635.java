import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem5635 {
	static class P implements Comparable<P>{
		String n;
		int y;
		int m;
		int d;
		public P(String n, int d, int m, int y){
			this.n = n;
			this.d = d;
			this.m = m;
			this.y = y;
		}
		
		@Override
		public int compareTo(P p){
			if(y - p.y > 0){
				return 1;
			} else if(y - p.y == 0) {
				if(m - p.m > 0){
					return 1;
				} else if(m - p.m == 0) {
					if(d - p.d > 0){
						return 1;
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}else {
				return -1;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		P[] list = new P[n];
		for(int i = 0; i < n; i++){
			String[] s = br.readLine().split(" ");
			P p = new P(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
			list[i] = p;
		}
		Arrays.sort(list);
		System.out.println(list[n-1].n);
		System.out.println(list[0].n);
	}
}
