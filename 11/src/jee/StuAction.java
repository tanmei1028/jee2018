package jee;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class StuAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	List<String[]> stus;

	public List<String[]> getStus() {
		return stus;
	}

	/*
	 * List<Stu> stusByObj;
	 * 
	 * public List<Stu> getStusByObj() { return stusByObj; }
	 */

	public String execute() throws Exception {
		StuDAO dao = new StuDAOImp();
		stus = dao.getAllStus();
		/* stusByObj = dao.getAllStusByObj(); */
		return SUCCESS;

	}

	Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public String save() throws Exception {
		StuDAO dao = new StuDAOImp();
		boolean isSuc = dao.save(stu);
		return isSuc ? SUCCESS : ERROR;
	}

	/*
	 * public String edit() throws Exception { StuDAO dao = new StuDAOImp(); stu
	 * = dao.findById(stu.getId()); return SUCCESS; }
	 * 
	 * public String update() throws Exception { StuDAO dao = new StuDAOImp();
	 * boolean isSuc = dao.update(stu); return isSuc ? SUCCESS : ERROR; }
	 * 
	 * public String del() throws Exception { StuDAO dao = new StuDAOImp();
	 * boolean isSuc = dao.delById(stu.getId()); return isSuc ? SUCCESS : ERROR;
	 * }
	 */
}
