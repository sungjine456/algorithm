import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2293 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int num;
		int[] dp = new int[m+1];
		dp[0] = 1;
		for(int i = 0; i < n; i++){
			num = Integer.parseInt(br.readLine());
			for(int j = num; j <= m; j++){
				dp[j] += dp[j - num];
			}
		}
		System.out.println(dp[m]);
	}
}
