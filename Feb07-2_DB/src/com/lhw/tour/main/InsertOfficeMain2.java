package com.lhw.tour.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertOfficeMain2 {

	public static void main(String[] args) {
		Connection con = null; // ����
		PreparedStatement pstmt = null; // DB������ ��ɾ ����/���� ���ִ� ��
		Scanner keyboard = null;
		try {
			keyboard = new Scanner(System.in);
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "lhw", "lhw");
			System.out.println("�����");
			
			System.out.print("ȣ : ");
			String room = keyboard.next();
			System.out.print("�ǹ� : ");
			String building = keyboard.next();
			System.out.print("�� : ");
			int floor = keyboard.nextInt();
			
			
			
			// �ڹ� ������ ���� ���;� �� �ڸ��� ?��
			String sql = "insert into feb07_room values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, room);
			pstmt.setString(2, building);
			pstmt.setInt(3, floor);
			
			// �� ���� ������ ������� �� ���� ����
			int row = pstmt.executeUpdate();
			if (row == 1) {
				System.out.println("��� ����");
			}
		} catch (Exception e) {
		} finally {
			keyboard.close();
			try {pstmt.close();} catch (Exception e) {}
			try {con.close();} catch (Exception e) {}
		}
	}
}
