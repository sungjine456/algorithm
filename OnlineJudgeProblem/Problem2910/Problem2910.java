import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem2910 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		while(st.hasMoreTokens()){
			int m = Integer.parseInt(st.nextToken());
			if(map.containsKey(m)){
				map.put(m, map.get(m) + 1);
			} else {
				map.put(m, 1);
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(map.keySet());
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				int mv1 = map.get(i1);
				int mv2 = map.get(i2);
				if(mv1 < mv2){
					return 1;
				} else if(mv1 > mv2){
					return -1;
				}
				return 0;
			}
		});
		for(int i = 0; i < list.size(); i++){
			int k = map.get(list.get(i));
			for(int j = 0; j < k; j++){
				sb.append(list.get(i));
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}
