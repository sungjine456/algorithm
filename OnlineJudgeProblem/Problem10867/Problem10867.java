import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Problem10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		Set<Integer> set = new TreeSet<Integer>();
		while(st.hasMoreTokens()){
			set.add(Integer.parseInt(st.nextToken()));
		}
		Iterator<Integer> iterator = set.iterator();
		StringBuilder sb = new StringBuilder();
		sb.append(iterator.next());
		while(iterator.hasNext()){
			sb.append(" ");
			sb.append(iterator.next());
		}
		System.out.print(sb.toString());
	}
}
