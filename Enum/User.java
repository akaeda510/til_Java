import java.util.ArrayList;

public class User {
	public enum UserRole {
		USER("利用者"), 
		ADMIN("管理者"),
		STAFF("スタッフ");

		private final String label;

		UserRole(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

	}

	public enum UserStatus {
		ACTIVE("有効"),
		INACTIVE("無効");

		private final String label;

		UserStatus(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}
	}


	private String name;
	private UserRole role;
	private UserStatus status;

	public User(String name, UserRole role, UserStatus status) {
		this.name = name;
		this.role = role;
		this.status = status;

	}

	@Override
	public String toString() {
		if (status == UserStatus.INACTIVE) {
			return name + "さん。あなたのアカウントは" + status.getLabel() + "なので利用できません";
		} else if (role == UserRole.ADMIN) {
			return name + "さん" + " (" + role.getLabel() + ")" + "今日もよろしくお願いします。";
		} else if (role == UserRole.STAFF) {
			return name + "さん" + " (" + role.getLabel() + ")" + "今日のタスクはこちらです。";
		}
		return name + "さん" + " (" + role.getLabel() + ")" + "こんにちは";
	}


	public static void main (String[] args) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("田中太郎", UserRole.USER, UserStatus.ACTIVE));
		users.add(new User("山田花子", UserRole.ADMIN, UserStatus.ACTIVE));
		users.add(new User("山本浩信", UserRole.STAFF, UserStatus.ACTIVE));
		users.add(new User("鈴木直樹", UserRole.STAFF, UserStatus.INACTIVE));
		for (User user : users) {
			System.out.println(user);
		}
	}
}
