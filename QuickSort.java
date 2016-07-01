import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class QuickSort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		int size = Integer.parseInt(token.nextToken());
		int num = Integer.parseInt(token.nextToken());
		Integer[] array = new Integer[size];
		str = br.readLine();
		token = new StringTokenizer(str, " ");
		for(int i = 0; i < size; i++){
			array[i] = Integer.parseInt(token.nextToken());
		}
		System.out.println(quickSort(array, num - 1));
	}
	
	private static Integer quickSort(Integer[] array, int k){
		int l = 0;
		int r = array.length - 1;
		Random ran = new Random();
		while(r >= l){
			int pivot = ran.nextInt(r - l + 1) + l;
			int pivotVal = array[pivot];
			swap(array, pivot, r);
			int pivotIndex = l;
			for(int i = l; i < r; i++){
				if(array[i] < pivotVal){
					swap(array, i, pivotIndex);
					pivotIndex++;
				}
			}
			swap(array, r, pivotIndex);
			if(pivotIndex == k){
				return array[pivotIndex];
			} else if(pivotIndex < k){
				l = pivotIndex + 1;
			} else {
				r = pivotIndex - 1;
			}
		}
		return null;
	}
	
	private static void swap(Integer[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}