public class LCS {
	public static void main(String[] args) {
		char[] a = "abcd".toCharArray();
		char[] b = "bc".toCharArray();
		
		int aLen = a.length;
		int bLen = b.length;
		int[][] lcs = new int[aLen + 1][bLen + 1];
		
		for(int i = 1; i <= aLen; i++){
			for(int j = 1; j <= bLen; j++){
				if(a[i-1]==b[j-1]){
					lcs[i][j] = lcs[i-1][j-1] + 1;
				} else {
					lcs[i][j] = lcs[i-1][j]>lcs[i][j-1]?lcs[i-1][j]:lcs[i][j-1];
				}
			}
		}
		System.out.println(lcs[aLen][bLen]);
	}
}