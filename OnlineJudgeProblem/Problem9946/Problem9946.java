import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s1 = br.readLine();
		String s2 = br.readLine();
		int i = 1;
		while(!(s1.equals("END") && s2.equals("END"))){
			int len1 = s1.length();
			int len2 = s2.length();
			boolean is = true;
			if(len1==len2){
				int[] a = find(s1, len1);
				int[] b = find(s2, len2);
				for(int j = 0; j < 26; j++){
					if(a[j] != b[j]){
						is = false;
						break;
					}
				}
			} else {
				is = false;
			}
			sb.append("Case " + i++ + ": "+(is?"same\n":"different\n"));
			s1 = br.readLine();
			s2 = br.readLine();
		}
		System.out.println(sb.toString());
	}
	static int[] find(String s, int len){
		int[] arr = new int[26];
		for(int i = 0; i < len; i++){
			arr[s.charAt(i)-97] += 1;
		}
		return arr;
	}
}