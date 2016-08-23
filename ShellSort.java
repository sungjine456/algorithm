public class ShellSort {
	
	private static long[] data = {50, 30, 20, 21, 40, 12, 15, 64, 34, 50, 2, 1, 90};
	private static int len = data.length;

	public static void shellSort() {
		int inner, outer, h = 1;
		long temp;
		while (h <= len / 3) {
			h = h * 3 + 1;
		}

		while (h > 0) {
			for (outer = h; outer < len; outer++) {
				temp = data[outer];
				inner = outer;
				while (inner > h - 1 && data[inner - h] >= temp) {
					data[inner] = data[inner - h];
					inner -= h;
				}
				data[inner] = temp;
			}
			h = (h - 1) / 3;
		}
	}

	public static void main(String[] args) {
		shellSort();
		System.out.print("Data : ");
		for (int j = 0; j < len; j++){
			System.out.print(data[j] + " ");
		}
		System.out.println("");
	}
}