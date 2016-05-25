import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class DFS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());  // 정점의 개수
		int m = Integer.parseInt(st.nextToken());  // 간선의 개수
		int v = Integer.parseInt(st.nextToken());  // 시작 정점
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for(int i = 1; i <= n; i++){
			map.put(i, new ArrayList<Integer>());
		}
		// 간선 입력
		for(int i = 0; i < m; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map.get(a).add(b);
			map.get(b).add(a);
		}
		for(int i = 1; i <= n; i++){
			Collections.sort(map.get(i));
		}
        boolean[] bool = new boolean[n+1]; 
		dfs(map, bool, v);
	}
	static void dfs(Map<Integer, List<Integer>> map, boolean[] bool, int v){
		if(bool[v]) {
			return;
		}
		bool[v] = true;
		System.out.print(v + " ");
		for(int i : map.get(v)) {
			if(!bool[i]) {
				dfs(map, bool, i);
			}
		}
	}
}