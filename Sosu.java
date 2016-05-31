import java.util.Scanner;

public class Sosu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Boolean[] arr = new Boolean[n + 1];
		arr[0] = false;
		arr[1] = false;

		for(int i = 2; i <= n; i++){
			arr[i] = true;
		}
		
		for(int i=2; (i * i) <= n; i++){
			if(arr[i]){
				for(int j = i*i; j<=n; j+=i){
					arr[j] = false;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<=n; i++){
			if(arr[i]){
				sb.append(i + " ");
			}
		}
		
		System.out.println(new String(sb));
	}
}