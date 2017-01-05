import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11057 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][10];
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < 10; j++){
				if(i == 1){
					arr[1][j] = j + 1;
				} else {
					if(j ==0){
						arr[i][0] = 1;
					} else {
						arr[i][j] = (arr[i][j-1] + arr[i-1][j])%10007;
					}
				}
			}
		}
		System.out.println(arr[n][9]);
	}
}
