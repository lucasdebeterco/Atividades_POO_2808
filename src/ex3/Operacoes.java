package ex3;

public class Operacoes {
	private double num1;
	private double num2;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double soma(){
		return num1+num2;
	}
	public double subtrai(){
		return num1-num2;
	}
	public double multiplica(){
		return num1*num2;
	}
	public double divide(){
		return num1/num2;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Soma: " + soma());
		sb.append("\nSubtração: " + subtrai());
		sb.append("\nMultiplicação: " + multiplica());
		sb.append("\nDivisão: " + divide());
		return sb.toString();
	}
	
	
	

}
