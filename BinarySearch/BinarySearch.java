public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {3, 11, 16, 18, 21, 68, 98, 110, 132};
		int target = 98;
		boolean found = false;
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				found = true;
				break;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(found ? "Found" : "Not Found");
	}
}
