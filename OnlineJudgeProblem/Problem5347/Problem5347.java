import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem5347 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long g = gcd(a, b);
			sb.append((a * b)/g);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
