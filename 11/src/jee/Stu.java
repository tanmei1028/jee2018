package jee;

import java.sql.Date;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Stu {
	private long id;
	private String name, institute, profession, class_, tel, dormnum;
	private Date birth;

	public Stu() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getClass_() {
		return class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDormnum() {
		return dormnum;
	}

	public void setDormnum(String dormnum) {
		this.dormnum = dormnum;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		ResourceBundle bundle = ResourceBundle.getBundle("msg");
		String info = bundle.getString("stu.info");
		String res = MessageFormat.format(info, name);
		return res;
	}
}
