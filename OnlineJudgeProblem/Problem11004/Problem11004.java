import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11004 {
	static int[] arr;
	static int t;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		arr = new int[n]; 
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		quickSort(0, n-1);
		System.out.println(arr[t-1]);
	}
	
	private static void quickSort(int left, int right){
		int pivot = arr[right];
		int l = left;
		int r = right-1;
		while(l <= r){
			int lv = arr[l];
			int rv = arr[r];
			if(lv >= pivot && rv <= pivot){
				swap(l++, r--);
			} else if(lv < pivot && rv < pivot){
				l++;
			} else if(lv > pivot && rv > pivot){
				r--;
			} else {
				l++;
				r--;
			}
		}
		if(pivot < arr[l]){
			swap(l, right);
		}
		if(left<l-1)quickSort(left, l-1);
		if(l+1<right)quickSort(l+1, right);
	}
	
	private static void swap(int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
