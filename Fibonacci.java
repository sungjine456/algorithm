import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	static int[] ia = new int[21];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ia[0] = 0;
		ia[1] = 1;
		System.out.println(fibo(n));
	}
	static int fibo(int i){
		if(i == 0 || ia[i] != 0){
			return ia[i];
		}
		ia[i] = fibo(i - 2) + fibo(i - 1);
		return ia[i];
	}
}