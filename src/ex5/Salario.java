package ex5;

public class Salario {
	private double hora;
	private double quantHoras;

	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public double getQuantHoras() {
		return quantHoras;
	}
	public void setQuantHoras(double quantHoras) {
		this.quantHoras = quantHoras;
	}
	
	public double salarioBruto() {
		return hora*quantHoras;
	}

	public double descontoIr() {
		return salarioBruto()*0.11;
	}
	public double descontoInss() {
		return salarioBruto()*0.08;
	}
	public double descontoSindicato() {
		return salarioBruto()*0.05;
	}
	public double totalDescontos() {
		return ((descontoIr()+descontoInss())+descontoSindicato());
	}
	public double salarioLiquido() {
		return salarioBruto()-totalDescontos();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----------");
		sb.append("\nSalario bruto: " + salarioBruto());
		sb.append("\nDesconto imposto de renda: " + descontoIr());
		sb.append("\nDesconto INSS: " + descontoInss());
		sb.append("\nDesconto do sindicato: " + descontoSindicato());
		sb.append("\nTotal de descontos: " + totalDescontos());
		sb.append("\nSalario líquido: " + salarioLiquido());
		sb.append("\n-----------\n");
		return sb.toString();
	}
	

}
