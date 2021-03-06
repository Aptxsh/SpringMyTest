package test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	private IUserService userService;

	@Autowired
	public UserController(IUserService userService) {
		this.userService = userService;
	}

	public void register(String username, String password) {
		System.out.println("注册：" + username);
		userService.register(username, password);
	}
}
