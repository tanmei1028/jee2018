package jee;

import java.util.List;

public interface StuDAO {
	boolean check(String username, String password) throws Exception;

	List<String[]> getAllStus() throws Exception;

	List<Stu> getAllStusByObj() throws Exception;

	Stu findById(long id) throws Exception;

	boolean save(Stu stu) throws Exception;

	boolean delById(long id) throws Exception;

	boolean update(Stu stu) throws Exception;
}
