package com.kwon.at.product;

public class Computer extends Product {
	private String cpu;
	private String ram;
	private String hdd;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String name, int price, String cpu, String ram, String hdd) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("cpu : " + cpu);
		System.out.println("ram : " + ram);
		System.out.println("hdd : " + hdd);
	}
}
