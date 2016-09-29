import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2606 {
	static int cn;
	static int count = 0;
	static int[][] pair = new int[101][101];
	static int[] virus = new int[101];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		cn = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		for(int i = 0; i < size; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			pair[num1][num2] = 1;
			pair[num2][num1] = 1;
		}
		infection(1);
		System.out.println(count);
	}
	
	public static void infection(int num){
		virus[num] = 1;
		for(int i = 1; i <= cn; i++){
			if(virus[i] != 1 && pair[num][i] == 1){
				infection(i);
				count++;
			}
		}
	}
}
