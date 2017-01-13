import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			int num = Integer.parseInt(str[1]) - Integer.parseInt(str[0]);
			int repeat = 1;
			int count = 0;
			int result = 0;
			for(int j = 1; j <= num; j++){
				result = j;
				count += repeat;
				if(j%2==0){
					repeat++;
				}
				if(count >= num || count < 0){
					break;
				}
			}
			sb.append(result);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
