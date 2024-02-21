package Estoque;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $" + valorTotalEstoque();
	}
	
	public String valorTotalEstoque() {
		return String.format("%.2f", preco*quantidade);
	}
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
}
