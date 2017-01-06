import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11053 {
	static int[] arr, dp;
	static int num, n, result = 1, i, j;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		arr = new int[n];
		dp = new int[n];
		for(i = 0; i < n; i++){
			arr[i] = Integer.parseInt(s[i]);
		}
		for(i = 0; i < n; i++){
			num = 0;
			for(j = 0; j < i; j++){
				if(arr[i] > arr[j]){
					if(num < dp[j]){
						num = dp[j];
					}
				}
			}
			dp[i] = num + 1;
	        if (result < dp[i])
	        	result = dp[i];
		}
		System.out.println(result);
	}
}
