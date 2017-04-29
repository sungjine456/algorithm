import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			String s = br.readLine();
			StringTokenizer token = new StringTokenizer(s, " ");
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int value = 1;
			
			for(int j = 0; j < b; j++){
				value *= a;
				value %= 10;
			}
			
			sb.append(value==0?10:value);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
