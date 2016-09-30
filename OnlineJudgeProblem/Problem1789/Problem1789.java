import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		System.out.println((int)(Math.sqrt(8 * num + 1) - 1) / 2);
	}
}
