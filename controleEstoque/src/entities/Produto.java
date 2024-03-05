package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entitiesEnum.enumpack;

public class Produto {

	private String nome;
	private Double preco;
	private int qntEstoque;
	private Date dataVenc;
	private int ID;
	
	private enumpack situacao;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
	
	public Produto() {
	}

	public Produto(int ID, String nome, Double preco, int qntEstoque, Date dataVenc) {
		this.ID = ID;
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
		this.dataVenc = dataVenc;
	}

	public int getID() {
		return ID;
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
	
	public enumpack getSituacao() {
		return situacao;
	}

	public void addQnt(int quantidade) {
		this.qntEstoque += quantidade;
	}
	
	public void removeQnt(int quantidade) {
		if(this.qntEstoque > 0) {
			this.qntEstoque -= quantidade;
		}
		else if(qntEstoque == 0  ){
			this.situacao = enumpack.valueOf("ESGOTADO");
			System.out.println("Estoque esgotado");
			System.out.println();
		}
		
	}
	
	
	
}
