public class TargetNumber {
	public static void main(String[] args) {
		int[] array = {13, 16, 79, 21, 13, 1, 25, 22};
		int target = 13;
		boolean found = false;

		for(int element : array) {
			if (element == target) {
				found = true;
				break;
			}
		}

		System.out.println(found ? "Found" : "Not Found");
	}
}
