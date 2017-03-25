import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem2226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		BigInteger bi = BigInteger.ZERO;
		BigInteger two = new BigInteger("2");
		for(int i = 2; i <= n; i++){
			if(i%2==0){
				bi = bi.multiply(two).add(BigInteger.ONE);
			} else {
				bi = bi.multiply(two).subtract(BigInteger.ONE);
			}
		}
		System.out.println(bi);
	}
}
