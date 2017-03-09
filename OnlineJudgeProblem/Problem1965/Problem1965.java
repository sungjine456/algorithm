import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] data = new int[n];
		for(int i = 0; i < n; i++){
			data[i] = Integer.parseInt(st.nextToken());
		}
		lis(data);
	}
	static void lis(int[] data){
		int n = data.length;
		int[] l = new int[n];
		int max = 0;
		for (int i = 0; i < n; ++i) {
			l[i] = 1;
			for (int j = 0; j < i; ++j) {
				if (data[i] > data[j] && l[j] + 1 > l[i]) {
					l[i] = l[j] + 1;
				}
			}
			if (max < l[i]) {
				max = l[i];
			}
		}
		System.out.print(max);
	}
}
