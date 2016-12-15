public class LIS {
	public static void main(String[] args) {
		int[] data = {10, 20, 40, 30, 70, 50, 60};
		int n = data.length;
		int[] LIS = new int[n];
		int max = 0;
		for (int i = 0; i < n; ++i) {
			LIS[i] = 1;
			for (int j = 0; j < i; ++j) {
				if (data[j] < data[i] && LIS[j] + 1 > LIS[i]) {
					LIS[i] = LIS[j] + 1;
				}
			}
			if (max < LIS[i]) {
				max = LIS[i];
			}
		}
		System.out.println(max);
	}
}