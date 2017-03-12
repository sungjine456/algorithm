import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Problem13701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[33554433];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()){
			int n = Integer.parseInt(st.nextToken());
			if(arr[n]==0){
				sb.append(n + " ");
				arr[n] = 1;
			}
		}
		System.out.println(sb.toString());
	}
}
