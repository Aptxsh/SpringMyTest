package springmytest.aop.review;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Override
	public void register(String username, String password) {
		System.out.println("注册成功");
	}

	@Override
	public void login(String username, String password) {
		throw new RuntimeException("用户名或密码错误");
	}

}
