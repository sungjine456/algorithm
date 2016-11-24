import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem13900 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] iArr = new int[n];
		
		// case 1
//		long sum = 0;
//		for(int i = 0; i < n; i++){
//			iArr[i] = Integer.parseInt(strArr[i]);
//		}
//		for(int i = 0; i < n - 1; i++){
//			for(int j = i + 1; j < n; j++){
//				sum += iArr[i] * iArr[j];
//			}
//		}
//		System.out.print(sum);
		
		// case 2
		long sum = 0;
		for(int i = 0; i < n; i++){
			iArr[i] = Integer.parseInt(strArr[i]);
			sum += iArr[i];
		}
		sum -= iArr[0];
		long result = 0;
		for(int i = 0; i < n - 1; i++){
			result += iArr[i] * sum;
			sum -= iArr[i + 1];
		}
		System.out.print(result);
	}
}
