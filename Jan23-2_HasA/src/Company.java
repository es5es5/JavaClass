
public class Company {
	String name;
	int year;
	String position;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int year, String position) {
		super();
		this.name = name;
		this.year = year;
		this.position = position;
	}
	
	public void info() {
		System.out.printf("회사이름 : %s\n", name);
		System.out.printf("설립년도 : %d\n", year);
	}
}
