import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++){
			list.add(br.readLine());
		}
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return Integer.parseInt(o1.split(" ")[0]) - Integer.parseInt(o2.split(" ")[0]);
			}
		});
		for(int i = 0; i < n; i++){
			sb.append(list.get(i));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
