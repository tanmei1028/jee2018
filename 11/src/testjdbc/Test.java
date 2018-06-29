package testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// ����HSQLDB���ݿ�JDBC����
			Class.forName("org.hsqldb.jdbcDriver");
			// ���ڴ��н�����ʱ���ݿ�score���û���Ϊsa������Ϊ��
			@SuppressWarnings("unused")
			Connection connect = DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "");
			System.out.println("Link is OK��");

			Statement state = connect.createStatement();
			state.executeUpdate("create table Tb1 (ID INTEGER, Name VARCHAR(20))");
			System.out.println("Create is  OK��");

			state.executeUpdate("Insert into Tb1 (ID, Name) Values(1, '������')");
			state.executeUpdate("Insert into Tb1 (ID, Name) Values(2, '���»�')");
			System.out.println("Insert is OK��");

			PreparedStatement pstmt2 = connect.prepareStatement("select * from Tb1");
			ResultSet rs = pstmt2.executeQuery();
			while (rs.next()) {
				String x;
				x = rs.getString(1) + "   " + rs.getString(2);
				System.out.println(x);
			}
			System.out.println("Select is OK��");
			pstmt2.close();
			rs.close();

			state.close();
			connect.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
