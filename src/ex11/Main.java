package ex11;

public class Main {

	public static void main(String[] args) {
		
		Bomba b = new Bomba("Gasolina",1,1000);
		//Entrada - valor a ser pago || Sa�da - litros
		b.abastecerPorValor(10);
		
		//Entrada - litros || Sa�da - valor a ser pago
		b.abastecerPorLitro(1);
		b.alterarCombustivel("�lcool");
		
		System.out.println(b);
		

	}

}
