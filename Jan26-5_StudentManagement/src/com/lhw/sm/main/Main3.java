package com.lhw.sm.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.lhw.sm.Student.Student;

public class Main3 {

	public static void main(String[] args) {
		Scanner keyboard = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			keyboard = new Scanner(System.in);
			FileWriter fw = new FileWriter("C:\\Users\\soldesk\\Desktop\\student.txt", true);
			bw = new BufferedWriter(fw);

			FileReader fr = new FileReader("C:\\Users\\soldesk\\Desktop\\student.txt");
			br = new BufferedReader(fr);

			int menu = 0;

			String name = null;
			String bd = null;
			String txt = null;
			String line = null;
			String[] line2 = null;
			Student s = null;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

			while (true) {
				System.out.println("1. 학생등록");
				System.out.println("2. 학생조회");
				System.out.println("3. 종료");
				System.out.println("-----------");
				System.out.println("선택 : ");
				menu = keyboard.nextInt();

				if (menu == 1) {
					System.out.print("이름 : ");
					name = keyboard.next();
					System.out.print("생일(YYYYMMDD) : ");

					bd = keyboard.next();

					txt = String.format("%s,%s\r\n", name, bd);
					bw.write(txt);
					bw.flush();

				} else if (menu == 2) {
					while ((line = br.readLine()) != null) {
						line2 = line.split(",");
						s = new Student(line2[0], sdf.parse(line2[1]));
						s.info();
					}
				} else if (menu == 3) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
