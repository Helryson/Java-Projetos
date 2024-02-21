package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

	private String nome;
	private Double preco;
	private int qntEstoque;
	private Date dataVenc;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
	
	public Produto() {
	}

	public Produto(String nome, Double preco, int qntEstoque, Date dataVenc) {
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
		this.dataVenc = dataVenc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public Date getDataVenc() {
		return dataVenc;
	}
	
	public void addQnt(int quantidade) {
		this.qntEstoque += quantidade;
	}
	
	public void removeQnt(int quantidade) {
		this.qntEstoque -= quantidade;
	}
	
}
