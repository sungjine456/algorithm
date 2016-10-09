import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10994 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
        	System.out.println("*");
        	return;
        }
        int count = 1 + 4 * (n - 1);
        String[] strArr = new String[count];
        strArr[0] = "*";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; i++){
    		for(int j = 4 * (i - 1); j >= 0; j--){
    			String str = strArr[j];
    			str = "* " + str + " *";
    			strArr[j + 2] = str;
    		}
        	String star = "";
        	for(int j = 0; j < 1 + 4 * i; j++){
        		star += "*";
        	}
        	strArr[0] = star;
        	strArr[4 * i] = star;
        	star = "*";
        	for(int j = 1; j < 4 * i; j++){
        		star += " ";
        	}
        	star += "*";
        	strArr[1] = star;
        	strArr[4 * i - 1] = star;
        }
        for(int i = 0; i < count; i++){
        	sb.append(strArr[i] + "\n");
        }
        System.out.println(sb.toString());
	}
}
