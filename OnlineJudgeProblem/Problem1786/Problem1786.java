import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1786 {
	static char[] h;
	static char[] n;
	static int hLen;
	static int nLen;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		h = br.readLine().toCharArray();
		n = br.readLine().toCharArray();
		hLen = h.length;
		nLen = n.length;
		List<Integer> list = kcm();
		sb.append(list.size());
		sb.append("\n");
		for(int i: list){
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	static List<Integer> kcm(){
		List<Integer> re = new ArrayList<Integer>();
		int[] pi = getPi();
		int j = 0;
		for(int i = 0; i < hLen; i++){
			while(j > 0 && h[i] != n[j]){
				j = pi[j - 1];
			}
			if(h[i] == n[j]){
				if(j == nLen - 1){
					re.add(i - nLen + 2);
					j = pi[j];
				} else {
					j++;
				}
			}
		}
		return re;
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
