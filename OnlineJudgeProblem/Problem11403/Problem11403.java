import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11403 {
	static StringTokenizer st;
	static int[][] arr;
	static int i, j, k, num;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for(i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine());
			for(j = 0; j < n; j++){
				num = Integer.parseInt(st.nextToken());
				arr[i][j] = num==1?1:101;
			}
		}
		br.close();
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				for(k = 0; k < n; k++){
					if(arr[j][k]>arr[j][i]+arr[i][k]){
						arr[j][k]=arr[j][i]+arr[i][k];
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				num = arr[i][j];
				sb.append(num==101?0:1);
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
