
public class CalculadoraINT {
	public static void main(String[] args) {
		System.out.println("Primeirinha calculadora em Java");
		System.out.println("Ela é bem básiquinha, e para alterar tem que declarar os valores das variaveis.");
		
		int contador = 0;
		int multiplicando = 198;
		
		while(contador <= 200) {
			System.out.println(multiplicando + " x " + contador + " = " + multiplicando * contador);
			contador++;
		}
	}
}

