public class QuickSort {
	static int[] arr = {7,5,3,2,1,6,4};
	static int t;
	public static void main(String[] args) {
		quickSort(0, arr.length-1);
		for(int i : arr){
			System.out.print(i + " ");
		}
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