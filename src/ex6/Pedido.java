package ex6;

public class Pedido {
	private int codigo;
	private int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double totalItem() {
		double totalItem = 0;
		if (codigo == 100 || codigo == 103) {
			totalItem = 1.2*quantidade;
		} else if (codigo == 101 || codigo == 104) {
			totalItem = 1.3*quantidade;
		} else if (codigo == 102) {
			totalItem = 1.5*quantidade;
		} else if (codigo == 105) {
			totalItem = 1*quantidade;
		}
		return totalItem;
	}
}
