
public class Computer {
	double cpu;
	double ram;
	int hdd;
	
	// 기본 생성자 : 생성자를 전혀 건들지 않으면 자동으로 만들어 줌
	//			JSP, Sring ... 이 자동으로 객체를 만들 때 기본 생성자를 사용
	// 			무튼 기본 생성자를 항상 만드는게 습관으로 해두면 좋음
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	public Computer(double cpu, double ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}

}
