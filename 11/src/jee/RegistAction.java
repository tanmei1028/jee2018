package jee;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用doubleSelect 二级联下拉，配置环境是struts2.3 tomcat8.0 相关的类有： City.java Provice.java
 * doubleSelectTag.jsp DoubleSelectTagAction.java
 * 访问：http://localhost:8080/LearStruts2_4/doubleselectTag
 * 目的：简单就是选择一级列表之后出现二级菜单选项 这里使用的是传递对象的id到jsp页面，之后通过id查找
 * 
 * @param <City>
 * @param <Provice>
 */

public class RegistAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public RegistAction() {

	}

	public String execute() throws Exception {
		StuDAOImp ch = new StuDAOImp();
		boolean isHave = ch.save(stu);
		if (!isHave) {
			return "fail";
		}
		return SUCCESS;
	}

}
