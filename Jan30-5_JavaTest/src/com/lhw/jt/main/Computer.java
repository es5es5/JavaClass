package com.lhw.jt.main;

public class Computer {
	private String name;
	private String cpu;
	private int price;
	private int ram;
	private int hdd;
	private int ssd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String name, String cpu, int price, int ram, int hdd, int ssd) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.price = price;
		this.ram = ram;
		this.hdd = hdd;
		this.ssd = ssd;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public void info() {
		System.out.printf("품명 : %s\n",name);
		System.out.printf("가격 : %d\n",price);
		System.out.printf("CPU : %s\n",cpu);
		System.out.printf("RAM : %d\n",ram);
		System.out.printf("HDD : %d\n",hdd);
		System.out.printf("SSD : %d\n",ssd);
	}
}
