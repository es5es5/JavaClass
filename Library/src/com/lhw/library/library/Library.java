package com.lhw.library.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	Scanner keyboard = new Scanner(System.in);
	ArrayList<User> userList = new ArrayList<>();
	ArrayList<Book> bookList = new ArrayList<>();
	Room room = new Room();

	
	int choice = -1;

	public void showBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.printf("%d)", i + 1);
			bookList.get(i).bookInfo();
		}
	}

	public void openLibrary() {
		userList.add(new User("������", "010-23-123"));
		bookList.add(new Book("å1", "�۰�1", true));
		bookList.add(new Book("å2", "�۰�2", true));
		bookList.add(new Book("å3", "�۰�3", false));
		bookList.add(new Book("å4", "�۰�4", true));
		
		try {
			while (true) {
				System.out.println("--------------");
				System.out.println("1. �ݳ�/�뿩");
				System.out.println("2. ȸ�� ����");
				System.out.println("3. å ����");
				System.out.println("4. ������");
				System.out.println("--------------");
				choice = keyboard.nextInt();
				if (choice == 1) {
					System.out.println("--------------");
					System.out.println("1. �ݳ�");
					System.out.println("2. �뿩");
					System.out.println("--------------");
					choice = keyboard.nextInt();
					if (choice == 1) {
						userList.get(0).showMyBooks();
						System.out.print("�ݳ��� å ��ȣ : ");
						choice = keyboard.nextInt();
						Book thisBook = userList.get(0).getMyBook().remove(choice - 1);
						thisBook.setRent(true);
						userList.get(0).getMyBook().remove(choice - 1);
						bookList.add(thisBook);

					} else if (choice == 2) {
						showBookList();
						System.out.print("�뿩�� å ��ȣ : ");
						choice = keyboard.nextInt();
						if (bookList.get(choice-1).isRent()) {
							System.out.println("----------------dsfsfsdfsdfsdfsdf");
							//////////////////////////////////////////////////
							userList.get(0).addMyBook(bookList.get(choice - 1));
							bookList.get(choice - 1).setRent(false);
							///////////////////////////////////////////////
						} else {
							System.out.println("�뿩�� �� ���� å �Դϴ�.");
						}
					} else {
						break;
					}
				} else if (choice == 2) {
					while (true) {
						System.out.println("--------------");
						System.out.println("1. ȸ�� ���");
						System.out.println("2. ȸ�� ����");
						System.out.println("3. ȸ�� ���");
						System.out.println("--------------");

						choice = keyboard.nextInt();

						if (choice == 1) {
							System.out.print("ȸ�� �̸� : ");
							String name = keyboard.next();
							System.out.print("��ȭ ��ȣ : ");
							String phone = keyboard.next();
							userList.add(new User(name, phone));

						} else if (choice == 2) {
							for (int i = 0; i < userList.size(); i++) {
								System.out.printf("%d). \n", i + 1);
								userList.get(i).userInfo();
							}
							System.out.print("������ ȸ�� ��ȣ ���� : ");
							int n = keyboard.nextInt();
							userList.remove(n - 1);
						} else if (choice == 3) {
							// ȸ�� ���
							for (int i = 0; i < userList.size(); i++) {
								System.out.printf("%d). \n", i + 1);
								userList.get(i).userInfo();
							}
						} else {
							break;
						}
						System.out.println("");
					}
				} else if (choice == 3) {
					while (true) {
						System.out.println("--------------");
						System.out.println("1. å ���");
						System.out.println("2. å ��Ȳ");
						System.out.println("--------------");
						choice = keyboard.nextInt();
						if (choice == 1) {
							System.out.print("å ���� : ");
							String name = keyboard.next();
							System.out.print("�۰� : ");
							String writer = keyboard.next();
							Book newBook = new Book(name, writer, true);
							bookList.add(newBook);
						} else if (choice == 2) {
							showBookList();
						} else {
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
		}
	}
}
