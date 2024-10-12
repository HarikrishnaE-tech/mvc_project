package source;

import java.util.List;

public class User {
	private int userid;
	private String username;
	private String email;
	private String password;
	private String gender;
	private String state;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", state=" + state + "]";
	}

	public User(String username, String email, String password, String gender, String state) {
		super();

		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.state = state;
	}

	public User() {

	}

}
