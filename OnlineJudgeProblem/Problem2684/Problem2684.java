import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2684 {
	enum e{
		TTT(0), TTH(1), THT(2), THH(3), HTT(4), HTH(5), HHT(6), HHH(7);
		int v;
		e(int v){
			this.v=v;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr;
		for(int i = 0; i < n; i++){
			arr = new int[8];
			char[] s = br.readLine().toCharArray();
			int len = s.length;
			for(int j = 0; j < len-2; j++){
				char[] c = {s[j],s[j+1],s[j+2]};
				String str = String.valueOf(c);
				arr[e.valueOf(str).v] += 1;
			}
			for(int j : arr){
				sb.append(j + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}