
public class Doctor {

	public void start(Guest g) {
		g.say();
		sayResult(g);
	}
	
	public void calculate(Guest g, Paper p) {
		g.stdWeight = (p.height - 100) * 0.9;
		g.bimando = (p.weight / g.stdWeight) * 100;
	}
	
	public void sayResult(Guest g) {
		System.out.printf("표준 체중 : %.1fkg\n", g.stdWeight);
		System.out.printf("비만도 : %.1f%%\n", g.bimando);
	}
}
