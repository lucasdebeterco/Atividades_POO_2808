package ex5;

public class SalarioMain {

	public static void main(String[] args) {
		Salario s = new Salario();
		
		// Valor da hora 
		s.setHora(10);
		// Quantida de horas no mês
		s.setQuantHoras(100);
		System.out.println(s);
	}

}
