package excinco;

public class Conta {
	
	private String nome;
	private int nConta;
	private double saldo;
	
	public Conta(String nome, int nConta, double saldoInicial) {
		this.nome = nome;
		this.nConta = nConta;
		deposita(saldoInicial);
	}
	public Conta(String nome, int nConta) {
		this.nome = nome;
		this.nConta = nConta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnConta() {
		return nConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Nome: " + nome + ", N da conta: " + nConta + ", Saldo: $ " + String.format("%.2f", saldo);
	}

	public void deposita(double quantia) {
		this.saldo += quantia;
	}
	
	public void saque(double quantia) {
		this.saldo -= quantia + 5;
	}
}
