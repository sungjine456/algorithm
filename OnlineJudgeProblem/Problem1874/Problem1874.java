import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[100001];
		int maxNum = 0;
		int inputIdx = 0;
		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(br.readLine());
			if(input[inputIdx] < num){
				for(int j = maxNum; j < num; j++){
					input[inputIdx++] = j + 1;
					sb.append("+\n");
				}
				maxNum = num;
			}
			if(input[--inputIdx] == num){
				sb.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb.toString());
	}
}
