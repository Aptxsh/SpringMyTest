package test;

public class UserDao {

	public boolean usernameExists(String username) {
		String name = "admin";
		if (name.equals(username)) {
			return false;
		}
		return true;
	}

	public void insert(String username, String encodedPassword) {
		System.out.println("插入用户" + username + "(" + encodedPassword + ")");
	}
}
