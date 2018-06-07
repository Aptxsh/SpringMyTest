package test1;

public class UserController {

	private IUserService userService;

	public UserController(IUserService userService) {
		this.userService = userService;
	}

	public void register(String username, String password) {
		System.out.println("注册：" + username);
		userService.register(username, password);
	}
}
