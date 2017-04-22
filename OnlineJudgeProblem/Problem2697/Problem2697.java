import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2697 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String[] s = br.readLine().split("");
			int size = s.length;
			int[] arr = new int[size];
			for(int i = 0; i < size; i++){
				arr[i] = Integer.parseInt(s[i]);
			}
			boolean isBool = true;
			for(int i = size-2; i >= 0; i--){
				if(arr[i] < arr[i+1]){
					int a = arr[i];
					int m = 0;
					int[] copyarr = new int[size-i];
					System.arraycopy(arr, i, copyarr, 0, size-i);
					Arrays.sort(copyarr);
					for(int z : copyarr){
						if(a < z){
							m = z;
							break;
						}
					}
					arr[i] = m;
					boolean is = true;
					for(int j=0,k=i+1; k < size; j++,k++){
						if(copyarr[j]==m&&is){
							is=false;
							j++;
						}
						arr[k] = copyarr[j];
					}
					isBool = false;
					break;
				}
			}
			if(isBool){
				sb.append("BIGGEST\n");
			} else {
				for(int i : arr){
					sb.append(i);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
