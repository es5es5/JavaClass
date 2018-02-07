package com.lhw.tour.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectMain {
	public static void main(String[] args) {
		
		Scanner keyboard = null;
		Connection con = null; // ����
		PreparedStatement pstmt = null; // db�� ���� �۾�
		ResultSet rs = null; // select�� ����� ����
		try {
			// ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "kwon", "kwon");
			
			// �Է�
			keyboard = new Scanner(System.in);
			System.out.print("������� : ");
			String what = keyboard.next();
			
			// sql
			String sql = "select e_name, o_where, o_floor, o_ho, e_phone " + 
					"from feb07_office, feb07_employee, feb07_damdang " + 
					"where o_ho = e_office and e_phone = d_phone " + 
					"	and d_damdang = ? " + 
					"order by e_name";
			
			// pstmt �����
			pstmt = con.prepareStatement(sql);
			
			// ?�� �� ä���
			pstmt.setString(1, what); 
			
			// ����
			// insert, update, delete : pstmt.executeUpdate();
			// select
			rs = pstmt.executeQuery();
			
			// rs.next(); : ���� �����ͷ� ����
			//				���� �����Ͱ� ������ false, ������ true
			while (rs.next() == true) {
				// rs.getString("e_name") : ���� �������� e_name�ʵ� ��
				System.out.println( rs.getString("e_name") );
				System.out.println( rs.getString("o_where") );
				System.out.println( rs.getInt("o_floor") );
				System.out.println( rs.getString("o_ho") );
				System.out.println( rs.getString("e_phone") );
				System.out.println("-----");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			try {rs.close();} catch (Exception e) {}
			try {pstmt.close();} catch (Exception e) {}
			try {con.close();} catch (Exception e) {}
		}
		
	}
}







