package ex8;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Lucas");
		p.setIdade(50);
		p.setPeso(1.80);
		p.setAltura(1.80);
		
		p.crescer(5);
		p.emagrecer(2);
		p.engordar(1);
		p.envelhecer(1);
		
		System.out.println(p);

	}

}
