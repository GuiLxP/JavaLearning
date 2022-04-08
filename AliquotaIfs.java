
public class AliquotaIfs {

	public static void main(String[] args) {
		double salario = 3300.0;

		// De 1900.0 at� 2800.0 IR = 7.5% e R$ 142
		// De 2800.01 at� 3751.0 IR = 15% e R$ 350
		// De 3751.01 at� 4664.00 IR = 22.5% e R$ 636

		if (salario >= 1900.0 || salario <= 2800) {
			System.out.println("O IR � de 7.5% e a dedu��o na declara��o � de R$ 142");
		} else if (salario >= 2800.01 || salario <= 3751.0) {
			System.out.println("O IR � de 15% e a dedu��o na declara��o � de R$ 350");
		} else if (salario >= 3751.0 || salario <= 4664.00) {
			System.out.println("O IR � de 22.5% e a dedu��o na declara��o � de R$ 636");
		} else {
			System.out.println("Sal�rio fora do c�lculo pr� determinado.");
		}

		
		// switch case
		
		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("O m�s � Janeiro");
			break;
		case 2:
			System.out.println("O m�s � Fevereiro");
			break;
		case 3:
			System.out.println("O m�s � Mar�o");
			break;
		case 4:
			System.out.println("O m�s � Abril");
			break;
		case 5:
			System.out.println("O m�s � Maio");
			break;
		case 6:
			System.out.println("O m�s � Junho");
			break;
		case 7:
			System.out.println("O m�s � Julho");
			break;
		case 8:
			System.out.println("O m�s � Agosto");
			break;
		case 9:
			System.out.println("O m�s � Setembro");
			break;
		case 10:
			System.out.println("O m�s � Outubro");
			break;
		case 11:
			System.out.println("O m�s � Novembro");
			break;
		case 12:
			System.out.println("O m�s � Dezembro");
			break;
		default:
			System.out.println("M�s inv�lido");
			break;
		}
	}

}
