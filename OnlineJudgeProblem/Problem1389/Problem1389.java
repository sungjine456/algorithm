import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1389 {
	static String[] str;
	static int min = 101;
	static int result = 0;
	static int i, j, k, a, b, sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		int size = Integer.parseInt(str[0]);
		int relationSize = Integer.parseInt(str[1]);
		int[][] arr = new int[size][size];
		for(i = 0; i < size; i++){
			for(j = 0; j < size; j++){
				arr[i][j] = i == j?0:101;
			}
		}
		for(i = 0; i < relationSize; i++){
			str = br.readLine().split(" ");
			a = Integer.parseInt(str[0]) - 1;
			b = Integer.parseInt(str[1]) - 1;
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		for(i = 0; i < size; i++){
			for(j = 0; j < size; j++){
				for(k = 0; k < size; k++){
					if(j != k && i != k && i != j){
						if(arr[j][k] > arr[j][i] + arr[i][k]){
							arr[j][k] = arr[j][i] + arr[i][k];
						}
					}
				}
			}
		}
		for(i = 0; i < size; i++){
			sum = 0;
			for(j = 0; j < size; j++){
				sum += arr[i][j];
			}
			if(sum < min){
	            min = sum;
	            result = i;
	        }
		}
	    System.out.print(result + 1);
	}
}
