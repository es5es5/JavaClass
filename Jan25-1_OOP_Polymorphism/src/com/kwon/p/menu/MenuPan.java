package com.kwon.p.menu;

public class MenuPan {
	private Menu[] menus;
	
	public MenuPan() {
		menus = new Menu[3];
		menus[0] = new Chicken("ÈÄ¶óÀÌµå", 10000);
		menus[1] = new GolbaengE("°ñ¹ğÀÌ¼Ò¸é", 9000, "´ú¸Ê°Ô");
		menus[2] = new Soju("Âü", 3000, 20);
	}
	
	public void show() {
		
		for (Menu menu : menus) {
			menu.print();
			System.out.println("---");
		}
		
	}
}
