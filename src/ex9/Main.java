package ex9;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new Conta(1111,"Lucas",1000);
		c.incluirConta(2222);
		c.alteraNome("Lucão");
		c.deposito(50);
		c.saque(200);
		
		System.out.println(c);
	}

}
