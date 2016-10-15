import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1735 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] one = br.readLine().split(" ");
		String[] two = br.readLine().split(" ");

		int mol = Integer.parseInt(one[0]) * Integer.parseInt(two[1]) + Integer.parseInt(one[1]) * Integer.parseInt(two[0]);
		int den = Integer.parseInt(one[1]) * Integer.parseInt(two[1]);
		int a = mol;
		int b = den;
		int c = gcd(a, b);
		System.out.print((mol / c) + " " + (den / c));
	}
	
	static int gcd(int a, int b){
		return b != 0 ? gcd(b, a % b) : a;
	}
}
