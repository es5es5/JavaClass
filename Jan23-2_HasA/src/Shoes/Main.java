package Shoes;

public class Main {

	public static void main(String[] args) {
		Human hong = new Human("ȫ�浿", 20, 
				new Shoes("��������12", 260, 
						new Company("����Ű", 
								new City("����", 
										new Human("�ڿ���", 60, 
												new Shoes("���ȷ�ĳ���", 265, 
														new Company("����ι�", null)))))));
	System.out.println(hong.name);
	System.out.println(hong.shoes.size);
	System.out.println(hong.shoes.maker.name);
	System.out.println(hong.shoes.maker.Location.name);
	System.out.println(hong.shoes.maker.Location.mayor.name);
	System.out.println(hong.shoes.maker.Location.mayor.shoes.name);
	System.out.println(hong.shoes.maker.Location.mayor.shoes.maker.name);
	}
	
}
