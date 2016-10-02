import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long maxRoom = 1;
        int num = 6;
        int count = 1;
        while(n > maxRoom){
        	maxRoom += num;
        	num += 6;
        	count++;
        }
        System.out.println(count);
	}
}
