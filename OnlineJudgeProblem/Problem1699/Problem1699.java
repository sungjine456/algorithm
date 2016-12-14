import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1699 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		for(int i = 1; i <= n; i++){
			arr[i] = i;
			for(int j = 2; j * j <= i; j++){
				arr[i] = arr[i]<(arr[i - j * j] + 1)?arr[i]:arr[i - j * j] + 1;
			}
		}
		System.out.println(arr[n]);
	}
}
