import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10424 {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++){
			int a = Integer.parseInt(st.nextToken());
			arr[a-1] = a-i-1;
		}
		for(int i : arr){
			sb.append(i+"\n");
		}
		System.out.print(sb.toString());
	}
}
