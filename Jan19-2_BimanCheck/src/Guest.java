import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth;
	double stdWeight;
	double bimando;
	
	public void say() {
		mouth = new Scanner(System.in);
		
		System.out.printf("�̸� : ");
		name = mouth.next();
		
		System.out.println("Ű : ");
		height = mouth.nextInt();
		
		System.out.println("������ : ");
		weight = mouth.nextInt();

	}
	

}
