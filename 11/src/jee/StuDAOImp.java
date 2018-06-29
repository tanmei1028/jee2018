package jee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StuDAOImp implements StuDAO {
	String url = "jdbc:sqlserver://localhost:1434;databaseName=struts2";
	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String user = "sa";
	String pass = "";

	@Override
	public boolean check(String username, String password) throws Exception {
		Class.forName(driver);
		String sql = "select * from login where username=? and password=?";
		boolean isHave = false;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			try (ResultSet rs = pstmt.executeQuery();) {
				isHave = rs.next();
			}
		}
		return isHave;
	}

	@Override
	public List<String[]> getAllStus() throws Exception {
		List<String[]> stus = new ArrayList<>();
		Class.forName(driver);
		String sql = "select * from stu";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					String[] row = new String[5];
					row[0] = rs.getString("id");
					row[1] = rs.getString("username");
					row[2] = rs.getString("classes");
					row[3] = rs.getString("age");
					row[4] = rs.getString("java");
					stus.add(row);
				}
			}
		}
		return stus;
	}

	@Override
	public List<Stu> getAllStusByObj() throws Exception {
		List<Stu> stus = new ArrayList<>();
		Class.forName(driver);
		String sql = "select * from stu";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					Stu stu = new Stu();
					pstmt.setLong(1, stu.getId());
					pstmt.setString(2, stu.getName());
					pstmt.setString(3, stu.getInstitute());
					pstmt.setString(4, stu.getProfession());
					pstmt.setString(5, stu.getClass_());
					pstmt.setString(6, stu.getTel());
					pstmt.setString(7, stu.getDormnum());
					pstmt.setDate(8, stu.getBirth());
					stus.add(stu);
				}
			}
		}
		return stus;
	}

	@Override
	public Stu findById(long id) throws Exception {
		Stu stu = new Stu();
		Class.forName(driver);
		String sql = "select * from stu where id=?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setLong(1, id);
			try (ResultSet rs = pstmt.executeQuery();) {
				rs.next();
				stu.setId(rs.getLong("id"));
				stu.setName(rs.getString("name"));
				stu.setInstitute(rs.getString("institute"));
				stu.setProfession(rs.getString("profession"));
				stu.setClass_(rs.getString("class"));
				stu.setTel(rs.getString("tel"));
				stu.setDormnum(rs.getString("dormnum"));
				stu.setBirth(rs.getDate("birth"));

			}
		}
		return stu;
	}

	@Override
	public boolean save(Stu stu) throws Exception {
		boolean isSuc = false;
		Class.forName(driver);
		String sql = "insert into stu(id,name,institute,profession,class_,tel,dormnum,birth) values(?,?,?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setLong(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setString(3, stu.getInstitute());
			pstmt.setString(4, stu.getProfession());
			pstmt.setString(5, stu.getClass_());
			pstmt.setString(6, stu.getTel());
			pstmt.setString(7, stu.getDormnum());
			pstmt.setDate(8, stu.getBirth());

			int row = pstmt.executeUpdate();
			isSuc = row > 0;
		}
		return isSuc;
	}

	@Override
	public boolean update(Stu stu) throws Exception {
		boolean isSuc = false;
		Class.forName(driver);
		String sql = "update stu set username=?,java=?,math=?,os=? where id=?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setLong(1, stu.getId());
			pstmt.setString(2, stu.getName());
			pstmt.setString(3, stu.getInstitute());
			pstmt.setString(4, stu.getProfession());
			pstmt.setString(5, stu.getClass_());
			pstmt.setString(6, stu.getTel());
			pstmt.setString(7, stu.getDormnum());
			pstmt.setDate(8, stu.getBirth());
			int row = pstmt.executeUpdate();
			isSuc = row > 0;
		}
		return isSuc;
	}

	@Override
	public boolean delById(long id) throws Exception {
		boolean isSuc = false;
		Class.forName(driver);
		String sql = "delete from stu where id=?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setLong(1, id);
			int row = pstmt.executeUpdate();
			isSuc = row > 0;
		}
		return isSuc;
	}
}
