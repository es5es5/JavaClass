package com.lhw.os.human;

public class Human {
	private String name;
	private Hero myHero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hero getMyHero() {
		return myHero;
	}

	public void pickMyHero(Hero myHero) {
		this.myHero = myHero;
	}
	
	public void helpMe() {
		myHero.attack();
	}
	
	
}
