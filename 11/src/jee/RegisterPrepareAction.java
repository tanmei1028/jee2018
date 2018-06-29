package jee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterPrepareAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Institute> institutes;// Provice对象的列表
	private Map<Long, List<Profession>> professionMap;// 以Provice对象为key,Provice对应的City对象的列表作为value

	public Map<Long, List<Profession>> getProfessionMap() {
		return professionMap;
	}

	public void setProfessionMap(Map<Long, List<Profession>> professionMap) {
		this.professionMap = professionMap;
	}

	public List<Institute> getInstitutes() {
		return institutes;
	}

	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

	public RegisterPrepareAction() {

		institutes = new ArrayList<Institute>();

		Institute institute1 = new Institute(1, "信息科学与工程学院");
		Institute institute2 = new Institute(2, "土木建筑学院");
		Institute institute3 = new Institute(3, "生物工程学院");
		Institute institute4 = new Institute(4, "材料科学与工程学院");

		institutes.add(institute1);
		institutes.add(institute2);
		institutes.add(institute3);
		institutes.add(institute4);

		List<Profession> professions1 = new ArrayList<Profession>();
		List<Profession> professions2 = new ArrayList<Profession>();
		List<Profession> professions3 = new ArrayList<Profession>();
		List<Profession> professions4 = new ArrayList<Profession>();

		professions1.add(new Profession(1, "软件工程"));
		professions1.add(new Profession(2, "物联网"));
		professions1.add(new Profession(3, "计算机科学与技术"));

		professions2.add(new Profession(1, "土木工程"));
		professions2.add(new Profession(2, "土木类"));
		professions2.add(new Profession(3, "交通工程"));

		professions3.add(new Profession(1, "生物工程"));
		professions3.add(new Profession(2, "生物技术"));

		professions4.add(new Profession(1, "材料科学与工程"));
		professions4.add(new Profession(2, "材料类"));

		professionMap = new HashMap<Long, List<Profession>>();
		professionMap.put(institute1.getIns_id(), professions1);
		professionMap.put(institute2.getIns_id(), professions2);
		professionMap.put(institute3.getIns_id(), professions3);
		professionMap.put(institute4.getIns_id(), professions4);

	}

	public String execute() throws Exception {
		return SUCCESS;
	}
}
