import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5525 {
	static char[] s, p;
	static int n, sLen, pLen;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		sLen = Integer.parseInt(br.readLine());
		s = br.readLine().toCharArray();
		p = makeP().toCharArray();
		pLen = p.length;
		kmp();
		System.out.println(count);
	}
	static void kmp(){
		int[] pi = getPi();
		int j = 0;
		for(int i = 0; i < sLen; i++){
			while(j > 0 && s[i] != p[j]){
				j = pi[j - 1];
			}
			if(s[i] == p[j]){
				if(j == pLen - 1){
					count++;
					j = pi[j];
				} else {
					j++;
				}
			}
		}
	}
	static int[] getPi(){
		int j = 0;
		int[] arr = new int[pLen];
		for(int i = 1; i < pLen; i++){
			while(j > 0 && p[i] != p[j]){
				j = arr[j - 1];
			}
			if(p[i] == p[j]){
				arr[i] = ++j;
			}
		}
		return arr;
	}
	static String makeP(){
		StringBuilder sb = new StringBuilder();
		sb.append("I");
		for(int i = 0; i < n; i++){
			sb.append("OI");
		}
		return sb.toString();
	}
}
