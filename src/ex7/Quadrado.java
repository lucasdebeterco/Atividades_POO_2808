package ex7;

public class Quadrado {
	private double lado;

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double retornaArea() {
		return lado*lado;
	}
	@Override
	public String toString() {
		return "�rea: " + retornaArea() + "\nLado: " + lado;
	} 

}
