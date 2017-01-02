import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2502 {
	static int[] ia = new int[31];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int d = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		ia[0] = 0;
		ia[1] = 1;
		int x = fibo(d - 2);
		int y = fibo(d - 1);
		for(int i = 1; i < k; i++){
			for(int j = 1; j < k; j++){
				if(x * i + y * j == k){
					System.out.println(i);
					System.out.println(j);
					return;
				}
			}
		}
	}
	static int fibo(int i){
		if(i == 0 || ia[i] != 0){
			return ia[i];
		}
		ia[i] = fibo(i - 2) + fibo(i - 1);
		return ia[i];
	}
}
