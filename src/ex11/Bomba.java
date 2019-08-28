package ex11;

public class Bomba {
	private String tipoCombustivel;
	private double valorLitro;
	private double quantidadeCombustivel;
	
	public Bomba(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public double abastecerPorValor(double valor) {
		double aux = valor/valorLitro; 
		alterarQuantidadeCombustivel(aux);
		return aux;
	}
	
	public double abastecerPorLitro(double litros) {
		double aux = litros*valorLitro;
		alterarQuantidadeCombustivel(aux);
		return aux;
	}
	
	public double alterarValor(double valor){
		valorLitro = valor;
		return valorLitro;
	}
	
	public String alterarCombustivel(String tipo){ 
		tipoCombustivel = tipo;
		return tipoCombustivel;
	}
	
	public double alterarQuantidadeCombustivel(double qnt){ 
		quantidadeCombustivel -= qnt;
		return quantidadeCombustivel;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tipo: " + tipoCombustivel);
		sb.append("\nValor do litro: " + valorLitro);
		sb.append("\nQuantidade restante na bomba: " + quantidadeCombustivel);
		return sb.toString();
	}
}
