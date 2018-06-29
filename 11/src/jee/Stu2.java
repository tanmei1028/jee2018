package jee;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Stu2 {
	private long id;
	private String username, password, classes;
	private int age;
	private double java;

	public Stu2() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getJava() {
		return java;
	}

	public void setJava(double java) {
		this.java = java;
	}

	@Override
	public String toString() {
		ResourceBundle bundle = ResourceBundle.getBundle("msg");
		String info = bundle.getString("stu.info");
		String res = MessageFormat.format(info, username);
		return res;
	}
}
