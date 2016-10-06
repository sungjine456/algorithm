public class Problem4673 {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		int maxNum = 10000;
		int[] bool = new int[10036];
		for(int i = 1; i <= maxNum; i++){
			bool[selfNum(i)] = 1;
		}
		for(int i = 1; i <= maxNum; i++){
			if(bool[i] == 0){
				sb.append(i+"\n");
			}
		}
		System.out.println(sb.toString());
	}
	static int selfNum(int num){
		int result = num;
		while(num > 0){
			result += num % 10;
			num = num / 10;
		}
		return result;
	}
}
