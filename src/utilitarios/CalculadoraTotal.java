package utilitarios;

import entidades.Cliente;

public class CalculadoraTotal {

	public static Double calcPrecoTotal(int quantidade, Double preco) {

		//somador do valor total do pedido de cada cliente

		Double total = (preco * quantidade);
		
		return total;
	}
	
	public static Double calcValorTotal(Double valorTotal, Double precoTotal) {
		//somador do valor total de todos os pedidos de cada cliente
		valorTotal = valorTotal + precoTotal;
				
		return valorTotal;
	}
	
}
