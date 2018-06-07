package test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService implements IUserService {

	private IUserDao userDao;

	private BCryptPasswordEncoder passwordEncoder;

	public BCryptPasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(String username, String password) {
		System.out.println("检查用户名" + username + "是否存在...");
		if (userDao.usernameExists(username)) {
			System.out.println("加密明文密码...");
			String encodedPassword = passwordEncoder.encode(password); // 编码password
			userDao.insert(username, encodedPassword);
		} else {
			System.out.println("注册失败，用户名" + username + "已存在");
		}
	}
}
