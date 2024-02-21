package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Produto> list = new ArrayList<>();

	public Estoque() {
	}

	public void addProduto(Produto produto) {
		list.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		list.remove(produto);
	}
	
	public void imprimeLista() {
		for(Produto a : list) {
			System.out.println("Nome: " + a.getNome() + "\nQuantidade: " +  a.getQntEstoque() + "\nPreço: " +p a.getPreco());
		}
	}
	
}
