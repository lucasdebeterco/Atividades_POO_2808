package ex6;

import java.util.Scanner;

public class PedidoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		Pedido p = new Pedido();
		
		p.setCodigo(100);
		p.setQuantidade(2);
		System.out.println(p.totalItem());
		total += p.totalItem();
		
		p.setCodigo(103);
		p.setQuantidade(1);
		System.out.println(p.totalItem());
		total += p.totalItem();
		
		p.setCodigo(105);
		p.setQuantidade(5);
		System.out.println(p.totalItem());
		total += p.totalItem();
		
		p.setCodigo(102);
		p.setQuantidade(4);
		System.out.println(p.totalItem());
		total += p.totalItem();
		
		System.out.println("Total dos pedidos é: " + total);
		entrada.close();
	}

}
