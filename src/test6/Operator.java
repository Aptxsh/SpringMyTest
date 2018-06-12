package test6;

public class Operator {

	private Integer id;
	private String username;
	private String password;
	private String role;
	private Boolean disabled;

	public Operator(Integer id, String username, String password, String role, Boolean disabled) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.disabled = disabled;
	}

	public Operator(String username, String password, String role, Boolean disabled) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.disabled = disabled;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public Boolean getDisabled() {
		return disabled;
	}
}
