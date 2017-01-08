import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1431 {
	static char[] c;
	static int n, len, i, a;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String[] s = new String[t];
		for(i = 0; i < t; i++){
			s[i] = br.readLine();
		}
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2){
				if(s1.length() - s2.length() == 0){
					if(add(s1) - add(s2) == 0){
						return s1.compareTo(s2);
					} else {
						return add(s1) - add(s2);
					}
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		String vali = s[0];
		sb.append(vali);
		for(i = 1; i < t; i++){
			if(!vali.equals(s[i])){
				sb.append("\n");
				sb.append(s[i]);
			}
			vali = s[i];
		}
		System.out.println(sb.toString());
	}
	
	static int add(String str){
		c = str.toCharArray();
		n = 0;
		len = c.length;
		for(i = 0; i < len; i++){
			if('0' <= c[i] && '9' >= c[i]){
				a = c[i] - '0';
				n += a;
			}
		}
		return n;
	}
}
