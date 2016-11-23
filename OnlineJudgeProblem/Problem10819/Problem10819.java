import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem10819 {
	static int maxSum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] intArr = new int[n];
		int[] sortIntArr = new int[n];
		int half = n / 2;
		int max = 0;
		for(int i = 0; i < n; i++){
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		if(n % 2 == 0){
			Arrays.sort(intArr);
			int count = 0;
			for(int i = n - 1; i >= half; i--){
				sortIntArr[count++] = intArr[i - half];
				sortIntArr[count++] = intArr[i];
			}
			for(int i = 0; i < n - 1; i++){
				max += add(sortIntArr[i], sortIntArr[i + 1]);
			}
		} else {
			perm(intArr, 0, n, n);
			max = maxSum;
		}
		System.out.println(max);
    }
	
	static int add(int a, int b){
		int add = a - b;
		return add > 0?add:-add;
	}

	static void perm(int[] arr, int depth, int n, int k) {
		if (depth == k) {
			int i = sum(arr,k);
			if(i > maxSum){
				maxSum = i;
			}
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth);
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int sum(int[] arr, int k) {
		int add = 0;
		for (int i = 0; i < k - 1; i++) {
			add += add(arr[i], arr[i + 1]);
		}
		return add;
	}
}
