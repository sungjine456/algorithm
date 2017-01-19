import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Problem9442 {
	static Map<String, Integer> map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int year = 1;
		while(!s.equals("0")){
			String[] str = s.split(" ");
			int n = Integer.parseInt(str[0]);
			String[] sort = str[1].split("");
			map = new HashMap<String, Integer>();
			for(int i = 0; i < 26; i++){
				map.put(sort[i], i);
			}
			String[] sarr = new String[n];
			for(int i = 0; i < n; i++){
				sarr[i] = br.readLine();
			}
			Arrays.sort(sarr, new Comparator<String>() {
				public int compare(String o1, String o2) {
					char[] c1 = o1.toCharArray();
					char[] c2 = o2.toCharArray();
					int l1 = c1.length;
					int l2 = c2.length;
					int l = l1>l2?l2:l1;
					for(int i = 0; i < l; i++){
						if(map.get(String.valueOf(c1[i])) < map.get(String.valueOf(c2[i]))){
							return -1;
						} else if(map.get(String.valueOf(c1[i])) > map.get(String.valueOf(c2[i]))){
							return 1;
						}
					}
					return l1>l2?1:-1;
				}
			});
			sb.append("year ");
			sb.append(year++);
			sb.append("\n");
			for(int i = 0; i < n; i++){
				sb.append(sarr[i]);
				sb.append("\n");
			}
			s = br.readLine();
		}
		System.out.println(sb.toString());
	}
}
