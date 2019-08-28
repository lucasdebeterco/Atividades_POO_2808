package ex9;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;

	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int incluirConta(int numero) {
		this.numero = numero;
		return numero;
	}
	
	public String alteraNome(String nome) {
		this.nome = nome;
		return this.nome;
	}
	
	public double deposito(double qnt) {
		saldo += qnt;
		return saldo;
	}
	
	public double saque(double qnt) {
		saldo -= qnt;
		return saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----");
		sb.append("\nNúmero da conta: " + numero);
		sb.append("\nNome: " + nome);
		sb.append("\nSaldo: " + saldo);
		sb.append("\n-----\n");
		return sb.toString();
	}

}
