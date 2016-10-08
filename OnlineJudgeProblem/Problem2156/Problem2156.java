import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2156 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ia = new int[n + 1];
        int[] maxia = new int[n + 1];
        for(int i = 0; i < n; i++){
        	ia[i] = Integer.parseInt(br.readLine());
        }
    	maxia[0] = ia[0];
    	if(n == 1){
    		System.out.println(maxia[0]);
    		return;
    	}
    	maxia[1] = ia[0] + ia[1];
    	if(n == 2){
    		System.out.println(maxia[1]);
    		return;
    	}
    	maxia[2] = max(ia[0] + ia[1], max(ia[0] + ia[2], ia[1] + ia[2]));
        for(int i = 3; i < n; i++){
        	maxia[i] = max(max(ia[i] + maxia[i - 2], ia[i] + ia[i - 1] + maxia[i - 3]), maxia[i - 1]);
        }
        System.out.println(max(maxia[n - 1], maxia[n - 2]));
	}
	static int max(int a, int b){
		return a > b ? a : b;
	}
}
