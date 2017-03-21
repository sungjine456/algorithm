import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11404 {
	static int min = 100001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = i == j?0:min;
			}
		}
		while(m-->0){
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);
			if(arr[a][b] > c){
				arr[a][b] = c;
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					if(j != k && i != k && i != j){
						if(arr[j][k] > arr[j][i] + arr[i][k]){
							arr[j][k] = arr[j][i] + arr[i][k];
						}
					}
				}
			}
		}
	    for(int i = 0; i < n; i++){
	    	for(int j : arr[i]){
	    		sb.append(j+" ");
	    	}
	    	sb.append("\n");
	    }
	    System.out.println(sb.toString());
	}
}
