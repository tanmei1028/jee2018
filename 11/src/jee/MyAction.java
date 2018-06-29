package jee;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
