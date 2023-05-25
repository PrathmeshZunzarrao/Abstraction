package abstraction;

public class DellDriver {

	public static void main(String[] args) {
		
		Dell d1 = new Windows();
		
		d1.welcome("Prathmesh");
		d1.os();
		
		
		System.out.println("=======================================");
		
		
		Dell d2 = new Linux();
		
		d2.welcome("Prathm");
		d2.os();
	}
}
