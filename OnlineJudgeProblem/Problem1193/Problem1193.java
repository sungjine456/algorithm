import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1193 {
	static long[] ia = new long[91];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int group = 0;
		int groupCheck = 1;
		int num = n;
		while(groupCheck <= n){
			group += 1;
			groupCheck += group;
			num -= group;
		}
		num += group;
		if(group % 2 == 0){
			System.out.println(num + "/" + (group - num + 1));
		} else {
			System.out.println(group - num + 1 + "/" + num);
		}
	}
}
