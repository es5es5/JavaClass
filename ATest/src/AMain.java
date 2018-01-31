import java.util.ArrayList;
import java.util.Scanner;

import com.kwon.at.product.BallPen;
import com.kwon.at.product.Book;
import com.kwon.at.product.Computer;
import com.kwon.at.product.Product;

public class AMain {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner keyboard = null;
		ArrayList<Product> products = new ArrayList<>();
		int maxPrice = 0;
		Product maxP = null;
		try {
			keyboard = new Scanner(System.in);
			while (true) {
				System.out.println("1. 컴퓨터");
				System.out.println("2. 책");
				System.out.println("3. 볼펜");
				System.out.println("-----");
				System.out.print("뭐 : ");
				int what = keyboard.nextInt();
				System.out.print("품명 : ");
				String n = keyboard.next();
				System.out.print("가격 : ");
				int p = keyboard.nextInt();

				if (what == 1) {
					System.out.print("cpu : ");
					String c = keyboard.next();
					System.out.print("ram : ");
					String r = keyboard.next();
					System.out.print("hdd : ");
					String h = keyboard.next();
					Computer pc = new Computer(n, p, c, r, h);
					products.add(pc);
				} else if (what == 2) {
					System.out.print("저자 : ");
					String a = keyboard.next();
					Book b = new Book(n, p, a);
					products.add(b);
				} else {
					System.out.print("색깔 : ");
					String c = keyboard.next();
					BallPen bp = new BallPen(n, p, c);
					products.add(bp);
				}

				for (int i = 0; i < products.size(); i++) {
					if (products.get(i).getPrice() > maxPrice) {
						maxPrice = products.get(i).getPrice();
						maxP = products.get(i);
					}
				}
				System.out.println("------");
				System.out.println("최고가상품 ");
				maxP.print();
				System.out.println("------");
			}

		} catch (Exception e) {
			System.out.println("입력오류");
		} finally {
			System.out.println("어쨌든 스캐너는 닫음");
			keyboard.close();
		}
	}
}
