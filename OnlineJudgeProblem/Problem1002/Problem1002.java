import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			int x1 = Integer.parseInt(str[0]);
			int y1 = Integer.parseInt(str[1]);
			int r1 = Integer.parseInt(str[2]);
			int x2 = Integer.parseInt(str[3]);
			int y2 = Integer.parseInt(str[4]);
			int r2 = Integer.parseInt(str[5]);
			double line = Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));
			if(line > r1 + r2){
				sb.append(0);
			} else if(x1 == x2 && y1 == y2 && r1 == r2){
				sb.append(-1);
			} else if(line == 0 && r1 - r2 == line){
				sb.append(0);
			} else if(line < Math.abs(r2 - r1)){
				sb.append(0);
			} else if(line == r1 + r2 || line == Math.abs(r2 - r1)){
				sb.append(1);
			} else {
				sb.append(2);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
