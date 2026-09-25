public class Enum {
	enum Status {
		ACTIVE("有効"),
		INACTIVE("無効");

		private final String label;

		Status(String label) {
			this.label = label;
		}
		public String getLabel() {
			return label;
		}
	}
	
	static class Box<T> {
		private T value;
	
		public Box(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}
	}

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Status s = Status.ACTIVE;
		System.out.println(s + " : " + s.getLabel());

		for (Status status : Status.values()) {
			System.out.println(status + " : " + status.getLabel());
		}

		Box<String> stringBox = new Box<>("こんにちは");
		Box<Integer> intBox = new Box<>(42);
		System.out.println(stringBox.getValue());
		System.out.println(intBox.getValue());

		String[] names = {"太郎", "花子", "山田"};
		printArray(names);
	}
}
