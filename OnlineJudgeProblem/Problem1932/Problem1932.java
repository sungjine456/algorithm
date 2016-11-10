import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] iarr = new int[n][n];
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < str.length; j++){
				iarr[i][j] = Integer.parseInt(str[j]);
			}
		}
		int count = n - 1;
		for(int i = n - 1; i > 0; i--){
			for(int j = 0; j < count; j++){
				iarr[i - 1][j] = (iarr[i][j] > iarr[i][j + 1])?iarr[i][j] + iarr[i - 1][j]:iarr[i][j + 1]+ iarr[i - 1][j];
			}
			count--;
		}
		System.out.println(iarr[0][0]);
	}
}
