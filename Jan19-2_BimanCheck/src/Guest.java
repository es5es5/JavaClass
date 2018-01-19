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
		
		System.out.printf("이름 : ");
		name = mouth.next();
		
		System.out.println("키 : ");
		height = mouth.nextInt();
		
		System.out.println("몸무게 : ");
		weight = mouth.nextInt();

	}
	

}
