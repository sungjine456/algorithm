import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] size = br.readLine().split(" ");
		String[] aArr = br.readLine().split(" ");
		String[] bArr = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int aSize = Integer.parseInt(size[0]);
		int bSize = Integer.parseInt(size[1]);
		int i = 0, j = 0, a, b;
		while(i < aSize && j < bSize){
			a = Integer.parseInt(aArr[i]);
			b = Integer.parseInt(bArr[j]);
			if(a <= b){
				sb.append(a);
				sb.append(" ");
				i++;
			} else {
				sb.append(b);
				sb.append(" ");
				j++;
			}
		}
		if(i < aSize){
			while(i < aSize){
				sb.append(aArr[i]);
				sb.append(" ");
				i++;
			}
		} else {
			while(j < bSize){
				sb.append(bArr[j]);
				sb.append(" ");
				j++;
			}
		}
		System.out.println(sb.toString());
	}
}
