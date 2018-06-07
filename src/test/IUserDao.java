package test;

public interface IUserDao {

	boolean usernameExists(String username);

	void insert(String username, String encodedPassword);

}