
public class AliquotaIfs {

	public static void main(String[] args) {
		double salario = 3300.0;

		// De 1900.0 até 2800.0 IR = 7.5% e R$ 142
		// De 2800.01 até 3751.0 IR = 15% e R$ 350
		// De 3751.01 até 4664.00 IR = 22.5% e R$ 636

		if (salario >= 1900.0 || salario <= 2800) {
			System.out.println("O IR é de 7.5% e a dedução na declaração é de R$ 142");
		} else if (salario >= 2800.01 || salario <= 3751.0) {
			System.out.println("O IR é de 15% e a dedução na declaração é de R$ 350");
		} else if (salario >= 3751.0 || salario <= 4664.00) {
			System.out.println("O IR é de 22.5% e a dedução na declaração é de R$ 636");
		} else {
			System.out.println("Salário fora do cálculo pré determinado.");
		}

		
		// switch case
		
		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("O mês é Janeiro");
			break;
		case 2:
			System.out.println("O mês é Fevereiro");
			break;
		case 3:
			System.out.println("O mês é Março");
			break;
		case 4:
			System.out.println("O mês é Abril");
			break;
		case 5:
			System.out.println("O mês é Maio");
			break;
		case 6:
			System.out.println("O mês é Junho");
			break;
		case 7:
			System.out.println("O mês é Julho");
			break;
		case 8:
			System.out.println("O mês é Agosto");
			break;
		case 9:
			System.out.println("O mês é Setembro");
			break;
		case 10:
			System.out.println("O mês é Outubro");
			break;
		case 11:
			System.out.println("O mês é Novembro");
			break;
		case 12:
			System.out.println("O mês é Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}
	}

}
