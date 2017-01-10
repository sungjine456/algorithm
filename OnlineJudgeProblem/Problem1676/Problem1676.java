import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = Integer.parseInt(br.readLine());
		System.out.println((iNum / 5) + (iNum / 25) + (iNum / 125));
	}
}
