package test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
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
