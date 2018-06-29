package jee;

import com.opensymphony.xwork2.ActionSupport;

public class CheckLoginByObj extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username, password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		StuDAOImp ch = new StuDAOImp();
		boolean isHave = ch.check(getUsername(),getPassword());
		if (!isHave) {
			return "fail";
		}
		return SUCCESS;

	}
}
