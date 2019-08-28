package ex8;

public class Pessoa {
	private String nome;
	private double idade;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double envelhecer(double qnt) {
		idade += qnt;
		if (idade < 21) {
			double aux = qnt*0.05;
			crescer(aux);
		}
		return idade;
	}

	public double engordar(double qnt) {
		peso += qnt;
		return peso;
	}

	public double emagrecer(double qnt) {
		peso -= qnt;
		return peso;
	}

	public double crescer(double qnt) {
		altura += qnt;
		return altura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome " + nome);
		sb.append("\nIdade " + idade);
		sb.append("\nPeso " + peso);
		sb.append("\nAltura " + altura);
		return sb.toString();
	}
	
	

}
