package com.lhw.tour.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertOfficeMain {

	public static void main(String[] args) {
		Connection con = null; // ����
		PreparedStatement pstmt = null; // DB������ ��ɾ ����/���� ���ִ� ��
		try {
			// ������ DB ���� �ּ�
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// ������ �� OracleDriver�� ����Ѵٰ� java���� �˷���
			// �ڵ����� ã�� �� ����..
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "lhw", "lhw");
			System.out.println("�����");

			// sql ��
			String sql = "insert into feb07_room values(501,'����',5)";
			pstmt = con.prepareStatement(sql);
			// ������ ����/�����ϱ�
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// ���� �������� ������ (Connection�� ���������� ������)
			try {pstmt.close();} catch (Exception e) {}
			try {con.close();} catch (Exception e) {}
		}
	}
}
