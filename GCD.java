import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Long.parseLong(br.readLine());
		int b = Long.parseLong(br.readLine());
		System.out.println(gcd(a, b));
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}