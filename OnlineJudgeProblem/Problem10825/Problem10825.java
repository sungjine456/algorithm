import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem10825 {
	static class P {
		String n;
		int k;
		int e;
		int m;
		P(String n, int k, int e, int m){
			this.n = n;
			this.k = k;
			this.e = e;
			this.m = m;
		}
	}
	static int n;
	static List<P> list;
	static String[] str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new ArrayList<P>();
		for(int i = 0; i < n; i++){
			str = br.readLine().split(" ");
			list.add(new P(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3])));
		}
		br.close();
		Collections.sort(list, new Comparator<P>() {
			public int compare(P o1, P o2) {
				if(o1.k - o2.k < 0){
					return 1;
				} else if(o1.k - o2.k == 0) {
					if(o1.e - o2.e > 0){
						return 1;
					} else if(o1.e - o2.e == 0) {
						if(o1.m - o2.m < 0){
							return 1;
						} else if(o1.m - o2.m == 0) {
							return o1.n.compareTo(o2.n);
						}
					}
				}
				return -1;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(list.get(i).n);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
