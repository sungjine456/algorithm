import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int[] arr = new int[10];
		int sum = 0;

		for(int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			arr[n]++;
			sum += n;
		}
		if(sum % 3 != 0 || arr[0] == 0) {
			System.out.println(-1);
			return;
		} else {
			for(int i = 9; i >= 0; i--) {
				int n = arr[i];
				for(int j = 0; j < n; j++){
					sb.append(i);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
