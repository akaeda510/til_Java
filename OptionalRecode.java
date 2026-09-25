import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

record User(Long id, String name, String email) {}
record UserResponse(Long id, String name, String email) {
	public String displayName() {
		return name + " (" + email + ")";
	}
}

public class OptionalRecode {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1L, "田中太郎", "tanaka@example.com"));
		users.add(new User(2L, "佐藤花子", "satou@example.com"));
		users.add(new User(3L, "鈴木憲明", "sazuki@example.com"));

		Long targetId = 2L;
		Optional<User> foundUser = users.stream()
			.filter(user -> user.id().equals(targetId))
			.findFirst();

		Optional<UserResponse> response = foundUser
			.map(user -> new UserResponse(user.id(), user.name(), user.email()));

		String displayName = response
			.map(UserResponse::displayName)
			.orElse("ユーザーが見つかりませんでした");

		System.out.println(displayName);
	}
}
