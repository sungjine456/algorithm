import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Problem11652 {
	static int n;
	static long[] list;
	static int count = 0;
	static int maxCount = 0;
	static long now;
	static long max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new long[n];
		for(int i = 0; i < n; i++){
			list[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(list);
		now = list[0];
		max = list[0];
		for(int i = 0; i < n; i++){
			if(now == list[i]){
				count++;
			} else {
				if(count > maxCount){
					maxCount = count;
					max = now;
				}
				count = 1;
				now = list[i];
			}
		}
		if(count > maxCount){
			maxCount = count;
			max = now;
		}
		System.out.println(max);
	}
}