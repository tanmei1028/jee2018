package jee;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ʹ��doubleSelect ���������������û�����struts2.3 tomcat8.0 ��ص����У� City.java Provice.java
 * doubleSelectTag.jsp DoubleSelectTagAction.java
 * ���ʣ�http://localhost:8080/LearStruts2_4/doubleselectTag
 * Ŀ�ģ��򵥾���ѡ��һ���б�֮����ֶ����˵�ѡ�� ����ʹ�õ��Ǵ��ݶ����id��jspҳ�棬֮��ͨ��id����
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
