
public class TestaFatorial {
	
	public static void main(String[] args) {
		int mult = 1;
		for(int n = 1; n<= 10; n++) {
			System.out.print(n+"! =");
			
			for(int i = n; i >= 1; i--) {
				mult *= i;
				System.out.print(" "+i+" x");
			}
			System.out.println(" = "+mult);
			mult = 1;
		}
	}
}
