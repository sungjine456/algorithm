import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1912 {
	static int minus = -1000000;
	static boolean isMinus = true;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxNum = 0;
        int[] result = new int[n];
        String[] str = br.readLine().split(" ");
        result[0] = Integer.parseInt(str[0]);
        isMinus(result[0]);
        for(int i = 1; i < n; i++){
        	int num = Integer.parseInt(str[i]);
        	isMinus(num);
        	result[i] = max(result[i - 1] + num, num); 
        }
        for(int i = 0; i < n; i++){
        	if(result[i] > maxNum){
        		maxNum = result[i];
        	}
        }
        if(isMinus){
        	System.out.println(minus);
        } else {
        	System.out.println(maxNum);
        }
	}
	static int max (int a, int b){
		return a>b?a:b;
	}
	static void isMinus(int num){
		if(num < 0){
    		if(minus < num){
    			minus = num;
    		}
    	} else {
    		isMinus = false;
    	}
	}
}
