public class InsertSort {
	private static int[] arr = {50, 30, 20, 21, 40, 12, 15, 64, 34, 2, 1, 90};
	private static int len = arr.length;
	
	public static void insertSort(){
		for (int i = 1; i < len; i++) {
			int standard = arr[i];
			int point = i - 1;
			
			while (point >= 0 && standard < arr[point]) {
				arr[point + 1] = arr[point];
				point--;
			}
			
			arr[point + 1] = standard;
		}
	}
	public static void main(String[] args) {
		insertSort();
		System.out.print("Sort Data : ");
		for (int j = 0; j < len; j++){
			System.out.print(arr[j] + " ");
		}
	}
}
