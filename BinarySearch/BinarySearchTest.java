public class BinarySearchTest {
	public static boolean binarysearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return true;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}
	
	public static void main (String[] args) {
		int[] array = {3, 17, 23, 29, 31, 47, 59, 71, 97};
		System.out.println(binarysearch(array, 71));
		System.out.println(binarysearch(array, 3));
	}
}
