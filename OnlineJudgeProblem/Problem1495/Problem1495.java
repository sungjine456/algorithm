import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1495 {
	static int n, s, m, i, x;
	static boolean[][] dp;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		dp = new boolean[n + 1][m + 1];
		st = new StringTokenizer(br.readLine());
		dp[0][s] = true;
		for(i = 0; i < n; i++){
			x = Integer.parseInt(st.nextToken());
			for(int j = 0; j <= m; j++){
				if(!dp[i][j]) continue;
				if (j - x >= 0) dp[i + 1][j - x] = true;
	            if (j + x <= m) dp[i + 1][j + x] = true;
			}
		}
		for (i = m; i >= 0; i--) if (dp[n][i]) break;
		System.out.println(i);
	}
}
