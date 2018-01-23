
public class Teacher extends Human {
	String subject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}



	@Override
	public void info() {
		super.info();
		System.out.println(subject);
	}
	
	public void teaching() {
		System.out.println("가르치기");
	}

}
