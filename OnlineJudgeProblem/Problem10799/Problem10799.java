import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<Integer>();
		String str = br.readLine();
		int len = str.length();
		int count = 0;
		for(int i = 0; i < len; i++){
			if(str.charAt(i) == '('){
				s.push(i);
			} else {
				if (s.peek()+1 == i) {
                    s.pop();
                    count += s.size();
                } else {
                    s.pop();
                    count += 1;
                }
			}
		}
		System.out.println(count);
	}
}