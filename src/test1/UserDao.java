package test1;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao {

	@Override
	public boolean usernameExists(String username) {
		String name = "admin";
		if (name.equals(username)) {
			return false;
		}
		return true;
	}

	@Override
	public void insert(String username, String encodedPassword) {
		System.out.println("插入用户" + username + "(" + encodedPassword + ")");
	}
}
