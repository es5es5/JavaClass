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
		userList.add(new User("정균이", "010-23-123"));
		bookList.add(new Book("책1", "작가1", true));
		bookList.add(new Book("책2", "작가2", true));
		bookList.add(new Book("책3", "작가3", false));
		bookList.add(new Book("책4", "작가4", true));
		
		try {
			while (true) {
				System.out.println("--------------");
				System.out.println("1. 반납/대여");
				System.out.println("2. 회원 관리");
				System.out.println("3. 책 관리");
				System.out.println("4. 열람실");
				System.out.println("--------------");
				choice = keyboard.nextInt();
				if (choice == 1) {
					System.out.println("--------------");
					System.out.println("1. 반납");
					System.out.println("2. 대여");
					System.out.println("--------------");
					choice = keyboard.nextInt();
					if (choice == 1) {
						userList.get(0).showMyBooks();
						System.out.print("반납할 책 번호 : ");
						choice = keyboard.nextInt();
						Book thisBook = userList.get(0).getMyBook().remove(choice - 1);
						thisBook.setRent(true);
						userList.get(0).getMyBook().remove(choice - 1);
						bookList.add(thisBook);

					} else if (choice == 2) {
						showBookList();
						System.out.print("대여할 책 번호 : ");
						choice = keyboard.nextInt();
						if (bookList.get(choice-1).isRent()) {
							System.out.println("----------------dsfsfsdfsdfsdfsdf");
							//////////////////////////////////////////////////
							userList.get(0).addMyBook(bookList.get(choice - 1));
							bookList.get(choice - 1).setRent(false);
							///////////////////////////////////////////////
						} else {
							System.out.println("대여할 수 없는 책 입니다.");
						}
					} else {
						break;
					}
				} else if (choice == 2) {
					while (true) {
						System.out.println("--------------");
						System.out.println("1. 회원 등록");
						System.out.println("2. 회원 삭제");
						System.out.println("3. 회원 목록");
						System.out.println("--------------");

						choice = keyboard.nextInt();

						if (choice == 1) {
							System.out.print("회원 이름 : ");
							String name = keyboard.next();
							System.out.print("전화 번호 : ");
							String phone = keyboard.next();
							userList.add(new User(name, phone));

						} else if (choice == 2) {
							for (int i = 0; i < userList.size(); i++) {
								System.out.printf("%d). \n", i + 1);
								userList.get(i).userInfo();
							}
							System.out.print("삭제할 회원 번호 선택 : ");
							int n = keyboard.nextInt();
							userList.remove(n - 1);
						} else if (choice == 3) {
							// 회원 목록
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
						System.out.println("1. 책 등록");
						System.out.println("2. 책 현황");
						System.out.println("--------------");
						choice = keyboard.nextInt();
						if (choice == 1) {
							System.out.print("책 제목 : ");
							String name = keyboard.next();
							System.out.print("작가 : ");
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
