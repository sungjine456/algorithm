import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10974 {
	static int N;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		visited = new int[N + 1];
		backtrack(0, "");
	}

	public static void backtrack(int cnt, String str) {
		if (cnt == N) {
			System.out.println(str.trim());
		}

		for (int i = 1; i <= N; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				backtrack(cnt + 1, str + " " + i);
				visited[i] = 0;
			}
		}
	}
}
