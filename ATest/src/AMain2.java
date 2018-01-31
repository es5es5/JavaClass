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
			
			// 상품들을 저장할 뭔가를 만들어놓고
			ArrayList<Product> products = new ArrayList<>();
			
			while (true) {
				System.out.println("1. 컴터");
				System.out.println("2. 책"); 
				System.out.println("3. 볼펜");
				System.out.println("------------");
				System.out.print("뭐 : ");	int what = keyboard.nextInt();
				System.out.print("품명 : ");	String n = keyboard.next();
				System.out.print("가격 : ");	int p = keyboard.nextInt();

				if (what == 1) {
					System.out.print("cpu : ");	String c = keyboard.next();
					System.out.print("ram : ");	String r = keyboard.next();
					System.out.print("cpu : ");	String h = keyboard.next();
					Computer pc = new Computer(n, p, c, r, h);
					// 거기에 등록을
					products.add(pc);
				} else if (what == 2) {
					System.out.print("저자 : ");	String a = keyboard.next();
					Book b = new Book(n, p, a);
					// 거기에 등록을
					products.add(b);
				} else {
					System.out.print("색깔 : ");	String c = keyboard.next();
					BallPen bp = new BallPen(n, p, c);
					// 거기에 등록을
					products.add(bp);
				}
				int maxPrice = -1;
				Product maxProduct = null;
				for (int i = 0; i < products.size(); i++) {
					Product pp = products.get(i);
					
//					pp.print(); // 등록된 상품 전부 출력
//					System.out.println(pp.getPrice()); // 등록된 상품 가격만 출력
					
					int prpr = pp.getPrice();
					if (maxPrice < prpr) {
						maxPrice = prpr;
						maxProduct = pp;
					}
				}
				maxProduct.print();
			}
		} catch (Exception e) {
			System.out.println("입력오류");
		} finally {
			System.out.println("어쨌든 스캐너는 닫음");
			keyboard.close();
		}
	}
}
