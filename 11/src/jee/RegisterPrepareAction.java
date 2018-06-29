package jee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterPrepareAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Institute> institutes;// Provice������б�
	private Map<Long, List<Profession>> professionMap;// ��Provice����Ϊkey,Provice��Ӧ��City������б���Ϊvalue

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

		Institute institute1 = new Institute(1, "��Ϣ��ѧ�빤��ѧԺ");
		Institute institute2 = new Institute(2, "��ľ����ѧԺ");
		Institute institute3 = new Institute(3, "���﹤��ѧԺ");
		Institute institute4 = new Institute(4, "���Ͽ�ѧ�빤��ѧԺ");

		institutes.add(institute1);
		institutes.add(institute2);
		institutes.add(institute3);
		institutes.add(institute4);

		List<Profession> professions1 = new ArrayList<Profession>();
		List<Profession> professions2 = new ArrayList<Profession>();
		List<Profession> professions3 = new ArrayList<Profession>();
		List<Profession> professions4 = new ArrayList<Profession>();

		professions1.add(new Profession(1, "�������"));
		professions1.add(new Profession(2, "������"));
		professions1.add(new Profession(3, "�������ѧ�뼼��"));

		professions2.add(new Profession(1, "��ľ����"));
		professions2.add(new Profession(2, "��ľ��"));
		professions2.add(new Profession(3, "��ͨ����"));

		professions3.add(new Profession(1, "���﹤��"));
		professions3.add(new Profession(2, "���＼��"));

		professions4.add(new Profession(1, "���Ͽ�ѧ�빤��"));
		professions4.add(new Profession(2, "������"));

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
