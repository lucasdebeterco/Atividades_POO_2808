package ex2;

public class Intervalo {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void validaIntervalo() {
		int num1 = getNum1();
		int num2 = getNum2();

		if (num1 > num2) {
			System.out.println("Primeiro número maior, fazendo inversão..");
			int aux = this.num1;
			this.num1 = num2;
			this.num2 = aux;
		}
	}

	public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("----------------\n");
		    sb.append("Lista de números: ");
		    for (int i = num1; i <= this.num2; i++) {
		        sb.append(i);
		        sb.append(" ");
		    }
		    sb.append("\n----------------\n");
		    return sb.toString();
		}
}
