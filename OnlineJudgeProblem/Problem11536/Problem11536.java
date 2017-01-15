import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11536 {
	static int n;
	static String[] str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		str = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = br.readLine();
		}
		if(incre()){
			System.out.println("INCREASING");
		} else if(decre()) {
			System.out.println("DECREASING");
		} else {
			System.out.println("NEITHER");
		}
	}
	
	static boolean incre(){
		String a = str[0];
		for(int i = 1; i < n; i++){
			if(a.compareTo(str[i]) > 0){
				return false;
			}
			a = str[i];
		}
		return true;
	}
	
	static boolean decre(){
		String a = str[0];
		for(int i = 1; i < n; i++){
			if(a.compareTo(str[i]) < 0){
				return false;
			}
			a = str[i];
		}
		return true;
	}
}
