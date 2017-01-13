import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++){
			String[] str = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			int x = Integer.parseInt(str[2]);
			int y = Integer.parseInt(str[3]);
			if(m > n){
				int temp = m;
				m = n;
				n = temp;
				temp = x;
				x = y;
				y = temp;
			}
			int yj = x;
			int count = x;
			int result = 0;
			int g = m*n/gcd(m ,n);
			while(count<=g){
				if(y==yj){
					result = count;
					break;
				}
				count += m;
				yj += m;
				if(yj > n){
					yj %= n;
				}
			}
			sb.append(result==0?-1:result);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
