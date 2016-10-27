import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11727 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		for(int i = 1; i < n; i++){
			if(i % 2 != 0){
				result = (result * 2 + 1) % 10007;
			} else {
				result = (result * 2 - 1) % 10007;
			}
		}
		System.out.println(result);
	}
}
