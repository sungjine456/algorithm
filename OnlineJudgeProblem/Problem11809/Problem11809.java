import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int len1 = s1.length();
		int len2 = s2.length();
		int len = 0;
		if(len1 > len2){
			s2 = addZero(s2, len1-len2);
			len = len1;
		} else if(len1 < len2){
			s1 = addZero(s1, len2-len1);
			len = len2;
		} else {
			len = len1;
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < len; i++){
			int a = s1.charAt(i)-'0';
			int b = s2.charAt(i)-'0';
			if(a > b){
				sb1.append(a);
			} else if(a < b){
				sb2.append(b);
			} else {
				sb1.append(a);
				sb2.append(b);
			}
		}
		System.out.println(sb1.length()==0?"YODA":Integer.parseInt(sb1.toString()));
		System.out.println(sb2.length()==0?"YODA":Integer.parseInt(sb2.toString()));
	}
	static String addZero(String s, int len){
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < len; i++){
			sb.insert(0, 0);
		}
		return sb.toString();
	}
}