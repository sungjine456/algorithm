import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem9996 {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "*");
        String l = st.nextToken();
        String r = st.nextToken();
        StringBuilder sb = new StringBuilder();
        while(n-- > 0){
        	String s = br.readLine();
        	if(s.length() < l.length() + r.length()){
        		sb.append("NE\n");
        		continue;
        	}
        	if(l.equals(s.substring(0, l.length())) && r.equals(s.substring(s.length() - r.length(), s.length()))){
        		sb.append("DA\n");
        	} else {
        		sb.append("NE\n");
        	}
        }
        System.out.println(sb.toString());
    }
}
