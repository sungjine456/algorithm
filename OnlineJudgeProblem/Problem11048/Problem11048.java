import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11048 {
	static int[][] arr;
	static int[][] dp;
	static int n, m;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1][m+1];
		dp = new int[n+1][m+1];
		for(int i = 1; i <= n; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				int r = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
				dp[i][j] = r + arr[i][j];
			}
		}
		System.out.println(dp[n][m]);
	}
	static int max(int a, int b, int c){
		return a>b?c>a?c:a:c>b?c:b;
	}
}
