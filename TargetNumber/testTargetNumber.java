public class testTargetNumber {
	public static boolean linearSearch(int[] array, int target) {
// 		自身で考えたコード
		boolean found = false; 

		for (int element : array) {
			if (target == element) {
				found = true;
				break;
			}
		} 
		return found;

//		模範解答
//		for (int element : array) {
//			if (target == element) {
//				return true;
//			}
//		}
//		return false;
	}

	public static void main(String[] args) {
		int[] array = {12, 43, 46, 11, 1, 68};
		System.out.println(linearSearch(array, 11));
		System.out.println(linearSearch(array, 4));
	}
}
