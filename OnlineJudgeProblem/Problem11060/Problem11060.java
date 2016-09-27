import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11060 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] jump = new int[n];
		int[] minDis = new int[n];
		int max = 987654321;
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			jump[i] = Integer.parseInt(str[i]);
			minDis[i] = max;
		}
		minDis[0] = 0;
		for(int i = 0; i < n; i++){
			for(int j = 1; j <= jump[i]; j++){
				int next = i + j;
				if(next < n && minDis[next] > minDis[i] + 1){
					minDis[next] = minDis[i] + 1;
				}
			}
		}
		if(minDis[n - 1] != max){
			System.out.println(minDis[n - 1]);
		} else {
			System.out.println(-1);
		}
	}
}
