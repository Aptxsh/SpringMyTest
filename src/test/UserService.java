package test;

public class UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void register(String username, String password) {
		System.out.println("检查用户名" + username + "是否存在...");
		boolean flog = userDao.usernameExists(username);
		if (flog) {
			System.out.println("加密明文密码...");
			userDao.insert(username, password);
		}
	}
}
