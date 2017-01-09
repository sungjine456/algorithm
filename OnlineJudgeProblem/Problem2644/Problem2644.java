import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2644 {
	static StringTokenizer st;
	static int i, j, k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][n + 1];
		for(i = 1; i <= t; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		for(i = 1; i <= n; i++){
			for(j = 1; j <= n; j++){
				if(arr[i][j]!=1){
					arr[i][j]=101;
				}
			}
		}
		for(i = 1; i <= n; i++){
			for(j = 1; j <= n; j++){
				if(i == j){
					continue;
				}
				for(k = 1; k <= n; k++){
					if(i == k){
						continue;
					}
					if(j != k){
						if(arr[j][k] > arr[j][i] + arr[i][k]){
							arr[j][k] = arr[j][i] + arr[i][k];
						}
					}
				}
			}
		}
		System.out.println(arr[x][y]==101?-1:arr[x][y]);
	}
}
