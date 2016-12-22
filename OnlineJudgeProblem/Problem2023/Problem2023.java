import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2023 {
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int startNum[] = {2, 3, 5, 7};
		br.close();
		for(int i = 0; i < 4; i++) {
			nextNum(startNum[i], 1);
		}
	}
	
	static void nextNum(int now, int len) {
		if(len == n) {
			System.out.println(now);
			return;
		}
		now *= 10;
		for(int i = 1; i <= 9; i+=2) {
			if(sosu(now + i)) {
				nextNum(now + i, len + 1);
			}
		}
	}

	static boolean sosu(int now) {
		if(now == 1) {
			return false;
		}
		for(int i = 2; i * i <= now; i++) {
			if(now % i == 0) {
				return false;
			}
		}
		return true;
	}
}
