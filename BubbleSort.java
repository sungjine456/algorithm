public class BubbleSort {
	private static int[] data = {50, 30, 20, 21, 40, 12, 15, 64, 34, 50, 2, 1, 90};
	private static int len = data.length;
	
	public static void bubbleSort(){
		int temp;

		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - 1 - i; j++) {
				if(data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		bubbleSort();
		System.out.print("Data : ");
		for(int j = 0; j < len; j++){
			System.out.print(data[j] + " ");
		}
		System.out.println("");
	}
}
