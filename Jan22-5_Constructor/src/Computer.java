
public class Computer {
	double cpu;
	double ram;
	int hdd;
	
	// �⺻ ������ : �����ڸ� ���� �ǵ��� ������ �ڵ����� ����� ��
	//			JSP, Sring ... �� �ڵ����� ��ü�� ���� �� �⺻ �����ڸ� ���
	// 			��ư �⺻ �����ڸ� �׻� ����°� �������� �صθ� ����
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