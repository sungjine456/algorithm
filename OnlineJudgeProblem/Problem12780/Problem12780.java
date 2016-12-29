import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12780 {
	static char[] h;
	static char[] n;
	static int hLen;
	static int nLen;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		h = br.readLine().toCharArray();
		n = br.readLine().toCharArray();
		hLen = h.length;
		nLen = n.length;
		kmp();
		System.out.println(count);
	}
	
	static void kmp(){
		int[] pi = getPi();
		int j = 0;
		for(int i = 0; i < hLen; i++){
			while(j > 0 && h[i] != n[j]){
				j = pi[j - 1];
			}
			if(h[i] == n[j]){
				if(j == nLen - 1){
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
		int[] arr = new int[nLen];
		for(int i = 1; i < nLen; i++){
			while(j > 0 && n[i] != n[j]){
				j = arr[j - 1];
			}
			if(n[i] == n[j]){
				arr[i] = ++j;
			}
		}
		return arr;
	}
}
