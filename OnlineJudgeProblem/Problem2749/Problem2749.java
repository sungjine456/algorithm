import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2749 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		int div = 1000000;
		int p = 1500000;
		int[] ar = new int[p];
		ar[0] = 0;
		ar[1] = 1;
		for(int i = 2; i < p; i++){
			ar[i] = (ar[i - 2] + ar[i - 1])%div;
		}
		long b = a%p;
		System.out.println(ar[(int)b]);
	}
}
