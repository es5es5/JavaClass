
public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("�̿�", 26, "��");
		Dog d1 = new Dog("�Ѷ�", 15, "����");
	
		h1.pet = d1;
		
		System.out.println(h1.pet.type);
		
		Human h2 = new Human("�ƺ�", 50, "��");
		Dog d2 = new Dog("�ݰ�", 3, "�߹�");
		
		h2.pet = d2;
		
		h2.pet.info();
		
		Human h3 = new Human("����", 46, "��");
		h3.pet = new Dog("����", 2, "�߹�");
		
		h3.pet.info();
		
		Human h4 = new Human("����", 22, "��", new Dog("�Ѷ�", 1, "����"));
		h4.pet.info();
		
		Company c1 = new Company("�Ｚ", 1990, "����");
		Product p1 = new Product("dd��", 1000, c1);
		
		p1.info();
	}

}
