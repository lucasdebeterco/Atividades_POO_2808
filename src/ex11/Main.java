package ex11;

public class Main {

	public static void main(String[] args) {
		
		Bomba b = new Bomba("Gasolina",1,1000);
		//Entrada - valor a ser pago || Saída - litros
		b.abastecerPorValor(10);
		
		//Entrada - litros || Saída - valor a ser pago
		b.abastecerPorLitro(1);
		b.alterarCombustivel("Álcool");
		
		System.out.println(b);
		

	}

}
