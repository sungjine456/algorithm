import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SieveOfEratosthenes{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[n + 1];
		for(int i = 2; i <= n; i++){
			arr[i] = true;
		}
		for(int i=2; (i * i) <= n; i++){
			if(arr[i]){
				for(int j = i*i; j<=n; j+=i){
					arr[j] = false;
				}
			}
		}
		for(int i=0; i<=n; i++){
			if(arr[i]){
				sb.append(i + " ");
			}
		}
		System.out.println(sb.toString());
	}
}