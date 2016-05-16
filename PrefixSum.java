import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] arr = new int[n];
		int[] sum = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			if(i != 0){
				sum[i] = sum[i - 1] + arr[i];
			} else {
				sum[i] = arr[i];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++){
			sa = br.readLine().split(" ");
			int f = Integer.parseInt(sa[0]) - 2;
			int l = Integer.parseInt(sa[1]) - 1;
			if(f - l == 0){
				sb.append(arr[l] + "\n");
			} else if(f < 0){
				sb.append((sum[l]) + "\n");
			} else {
				sb.append((sum[l] - sum[f]) + "\n");
			}
		}
		System.out.print(sb.toString());
	}
}