import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3062 {
	static int num, reverse;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
			num = Integer.parseInt(br.readLine());
			reverse = reverse(num);
			sb.append(match(num+reverse)?"YES\n":"NO\n");
		}
		System.out.println(sb.toString());
	}
	static int reverse(int num){
		int reverse = 0;
		while(num > 0){
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		return reverse;
	}
	static boolean match(int num){
		boolean bool = true;
		int[] arr = new int[6];
		int i = 0;
		while(num > 0){
			arr[i] = num % 10;
			num /= 10;
			i++;
		}
		int k = i - 1;
		for(int j = 0; j < i / 2; j++){
			if(arr[j] != arr[k]){
				bool = false;
			}
			k--;
		}
		return bool;
	}
}
