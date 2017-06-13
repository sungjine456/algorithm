import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			char[] s = st.nextToken().toCharArray();
			char[] p = st.nextToken().toCharArray();
			int count = 0;
			for(int i = 0; i < s.length; i++){
				if(s[i]==p[0]){
					if(s.length-i<p.length){
						count+=s.length-i;
						break;
					}
					boolean b = true;
					for(int j = 1; j<p.length; j++){
						if(s[j+i]!=p[j]){
							b = false;
							break;
						}
					}
					if(b){
						i += p.length-1;
					}
				}
				count++;
			}
			sb.append(count + "\n");
		}
		System.out.println(sb.toString());
	}
}
