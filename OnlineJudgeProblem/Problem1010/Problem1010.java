import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int j = 0; j < t; j++) {
			String[] sa = br.readLine().split(" ");
			int n = Integer.parseInt(sa[0]);
			int m = Integer.parseInt(sa[1]);
			BigInteger sum = BigInteger.ONE;
			for(int i = m; i > m - n; i--){
				sum = sum.multiply(BigInteger.valueOf(i));
			}
			for(int i = n; i > 0; i--){
				sum = sum.divide(BigInteger.valueOf(i));
			}
			sb.append(sum+"\n");
		}
		System.out.println(sb.toString());
	}
}
