import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2448 {
	static char[][] carr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		carr = new char[n][n*2-1];
		func(n, 0, 0);
		int k = n - 3;
		for(int i = 0; i < n; i++){
			if(n - 3 - i > 0){
				for(int j = 0; j < k; j++){
					sb.append(" ");
				}
			}
			for(int j = 0; j < n*2-1-k; j++){
				char c = carr[i][j];
				if(c != '\0'){
					sb.append(carr[i][j]);
				} else {
					sb.append(" ");
				}
			}
			if(i % 3 == 2){
				k -= 3;
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	static void func(int n, int x, int y){
		if(n == 3){
			carr[x][y+2] = '*';
			carr[x+1][y+1] = '*';
			carr[x+1][y+3] = '*';
			carr[x+2][y] = '*';
			carr[x+2][y+1] = '*';
			carr[x+2][y+2] = '*';
			carr[x+2][y+3] = '*';
			carr[x+2][y+4] = '*';
		} else {
			func(n/2, x, y);
			func(n/2, x+n/2, y);
			func(n/2, x+n/2, y+n);
		}
	}
}
