import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9020 {
	static int n = 10001;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[n];
		for(int i=2; (i * i) < n; i++){
			if(!arr[i]){
				for(int j = i*i; j< n; j+=i){
					arr[j] = true;
				}
			}
		}
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			for(int i = 0; i <= n/2; i++){
				int j = n - i;
				if(!arr[i] && !arr[j] && i+j==n){
					a = i;
					b = j;
				}
			}
			sb.append(a+" "+b);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
