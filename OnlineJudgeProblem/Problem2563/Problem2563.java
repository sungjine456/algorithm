import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] iArr = new int[100][100];
		int n = Integer.parseInt(br.readLine().trim());
		for(int i = 0; i < n; i++){
			String[] strArr = br.readLine().trim().split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			for(int j = a; j < a + 10; j++){
				for(int k = b; k < b + 10; k++){
					iArr[j][k] = 1;
				}
			}
		}
		int result = 0;
		for(int i = 0; i < 100; i++){
			for(int j = 0; j < 100; j++){
				if(iArr[i][j] == 1){
					result += 1;
				}
			}
		}
		System.out.println(result);
	}
}