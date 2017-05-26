import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] table = new int[301];
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			int m = Integer.parseInt(br.readLine());
			if(max < m){
				max = m;
			}
			arr[i] = m;
		}
		for(int i = 1; i <= max; i++){
			int j=i+1;
			table[i] = table[i-1]+(i*((j)%2==0?j*j/2+j/2:j*j/2+j/2+1));
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(table[arr[i]] + "\n");
		}
		System.out.println(sb.toString());
	}
}