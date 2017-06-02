import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem6603 {
	static StringBuilder sb = new StringBuilder();
	static int n;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = br.readLine();
			if(s.equals("0")){
				break;
			}
			StringTokenizer st = new StringTokenizer(s);
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			set(0, 0, "");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	static void set(int i, int j, String s){
		if(i>=n){
			if(j == 6){
				sb.append(s.trim()+"\n");
			}
			return;
		}
		set(i+1,j+1,s+" "+String.valueOf(arr[i]));
		set(i+1,j,s);
	}
}
