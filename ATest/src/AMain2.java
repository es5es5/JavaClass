import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.kwon.at.product.BallPen;
import com.kwon.at.product.Book;
import com.kwon.at.product.Computer;
import com.kwon.at.product.Product;

public class AMain2 {
	public static void main(String[] args) {

		Scanner keyboard = null;
		try {
			keyboard = new Scanner(System.in);
			
			// ��ǰ���� ������ ������ ��������
			ArrayList<Product> products = new ArrayList<>();
			
			while (true) {
				System.out.println("1. ����");
				System.out.println("2. å"); 
				System.out.println("3. ����");
				System.out.println("------------");
				System.out.print("�� : ");	int what = keyboard.nextInt();
				System.out.print("ǰ�� : ");	String n = keyboard.next();
				System.out.print("���� : ");	int p = keyboard.nextInt();

				if (what == 1) {
					System.out.print("cpu : ");	String c = keyboard.next();
					System.out.print("ram : ");	String r = keyboard.next();
					System.out.print("cpu : ");	String h = keyboard.next();
					Computer pc = new Computer(n, p, c, r, h);
					// �ű⿡ �����
					products.add(pc);
				} else if (what == 2) {
					System.out.print("���� : ");	String a = keyboard.next();
					Book b = new Book(n, p, a);
					// �ű⿡ �����
					products.add(b);
				} else {
					System.out.print("���� : ");	String c = keyboard.next();
					BallPen bp = new BallPen(n, p, c);
					// �ű⿡ �����
					products.add(bp);
				}
				int maxPrice = -1;
				Product maxProduct = null;
				for (int i = 0; i < products.size(); i++) {
					Product pp = products.get(i);
					
//					pp.print(); // ��ϵ� ��ǰ ���� ���
//					System.out.println(pp.getPrice()); // ��ϵ� ��ǰ ���ݸ� ���
					
					int prpr = pp.getPrice();
					if (maxPrice < prpr) {
						maxPrice = prpr;
						maxProduct = pp;
					}
				}
				maxProduct.print();
			}
		} catch (Exception e) {
			System.out.println("�Է¿���");
		} finally {
			System.out.println("��·�� ��ĳ�ʴ� ����");
			keyboard.close();
		}
	}
}
