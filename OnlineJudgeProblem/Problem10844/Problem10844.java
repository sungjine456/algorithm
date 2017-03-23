import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Problem10844 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][10];
		IntStream.range(1, 10).forEach(i->arr[0][i]=1);
		for(int i = 1; i < n; i++){
			for(int j = 0; j < 10; j++){
				if (j == 0) arr[i][j] = arr[i-1][j+1]%1000000000;
				else if (j == 9) arr[i][j] = arr[i-1][j-1]%1000000000;
				else arr[i][j] = (arr[i-1][j+1]+arr[i-1][j-1])%1000000000;
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++){
			sum = (sum+arr[n-1][i])%1000000000;
		}
		System.out.println(sum);
	}
}
