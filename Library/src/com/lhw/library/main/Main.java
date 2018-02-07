package com.lhw.library.main;

import java.util.ArrayList;

import com.lhw.library.library.Book;
import com.lhw.library.library.Library;
import com.lhw.library.library.Login;
import com.lhw.library.library.Room;
import com.lhw.library.library.User;

public class Main {
	
	public ArrayList<User> userList = new ArrayList<>();
	public ArrayList<Book> bookList = new ArrayList<>();
	public Room room = new Room();

	public static void main(String[] args) {
		Library lib = new Library();
		Login login = new Login();
		
		lib.openLibrary();
	}

}
