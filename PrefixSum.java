import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum {
	// 수 N개가 주어졌을 때, f번째 수부터 l번째 수까지 합을 구하라.
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());  // 수의 개수
		int[] arr = new int[n];
		int[] sum = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 수 N의 범위
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			if(i != 0){
				sum[i] = sum[i - 1] + arr[i];
			} else {
				sum[i] = arr[i];
			}
		}
		String[] sa = br.readLine().split(" ");
		prefixSum(sa, arr, sum);
	}
	static void prefixSum(String[] sa, int[] arr, int[] sum){
		StringBuilder sb = new StringBuilder();
		int f = Integer.parseInt(sa[0]) - 2;
		int l = Integer.parseInt(sa[1]) - 1;
		if(f - l == 0){
			sb.append(arr[l] + "\n");
		} else if(f < 0){
			sb.append((sum[l]) + "\n");
		} else {
			sb.append((sum[l] - sum[f]) + "\n");
		}
		System.out.print(sb.toString());
	}
}