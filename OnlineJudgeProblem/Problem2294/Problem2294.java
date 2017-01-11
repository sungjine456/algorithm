import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2294 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[] iar = new int[n];
		int[] dp = new int[m+1];
		for(int i = 0; i < n; i++){
			iar[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 1; i <= m; i++){
			dp[i] = 10001;
		}
		for(int i = 0; i < n; i++){
			for(int j = iar[i]; j <= m; j++){
				if(dp[j - iar[i]] + 1 < dp[j]){
					dp[j] = dp[j - iar[i]] + 1;
				}
			}
		}
		System.out.println(dp[m]==10001?-1:dp[m]);
	}
}
