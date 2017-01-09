import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1599 {
	static enum Minsik {a, b, k, d, e, g, h, i, l, m, n, ng, o, p, r, s, t, u, w, y}
	static Minsik m1, m2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = br.readLine();
		}
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String o1, String o2) {
				int len1 = o1.length();
				int len2 = o2.length();
				String[] s1 = o1.split("");
				String[] s2 = o2.split("");
				for(int i = 0, j = 0; i < len1 && j < len2; i++, j++){
					String str1 = s1[i];
					String str2 = s2[j];
					if(!str1.equals(str2)){
						m1 = Minsik.valueOf(str1);
						m2 = Minsik.valueOf(str2);
						return m1.ordinal() - m2.ordinal();
					} else if(i < len1-1 && str1.equals("n") && s1[i+1].equals("g")){
						if(!str2.equals("n")){
							m1 = Minsik.valueOf("ng");
							m2 = Minsik.valueOf(str2);
							return m1.ordinal() - m2.ordinal();
						} else if((j < len2-1 && !s2[j+1].equals("g")) || j == len2 - 1){
							m1 = Minsik.valueOf("ng");
							m2 = Minsik.valueOf(str2);
							return m1.ordinal() - m2.ordinal();
						} else if(j < len2-1 && str2.equals("n") && s2[j+1].equals("g")){
							j++;
						}
						i++;
					} else if(j < len2-1 && str2.equals("n") && s2[j+1].equals("g")){
						if(!str1.equals("n")){
							m1 = Minsik.valueOf(str1);
							m2 = Minsik.valueOf("ng");
							return m1.ordinal() - m2.ordinal();
						} else if ((i < len1-1 && !s1[i+1].equals("g")) || i == len1 - 1){
							m1 = Minsik.valueOf(str1);
							m2 = Minsik.valueOf("ng");
							return m1.ordinal() - m2.ordinal();
						} else if(i < len1-1 && str1.equals("n") && s1[i+1].equals("g")){
							i++;
						}
						j++;
					}
				}
				return len1 - len2;
			}
		});
		for(int i = 0; i < n; i++){
			System.out.println(s[i]);
		}
	}
}
