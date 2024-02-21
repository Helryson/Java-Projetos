package exquatro;

public class Cambio {
	public static double real;
	public double dolar;
	public double quantidade;
	public double iof;
	
	
	
	public Cambio(double dolar, double quantidade, double iof) {
		this.dolar = dolar;
		this.quantidade = quantidade;
		this.iof = iof;
	}



	public static double getReal() {
		return real;
	}



	public static void setReal(double real) {
		Cambio.real = real;
	}



	public double getDolar() {
		return dolar;
	}



	public void setDolar(double dolar) {
		this.dolar = dolar;
	}



	public double getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}



	public double getIof() {
		return iof;
	}



	public void setIof(double iof) {
		this.iof = iof;
	}



	public static void calculaCambio(double dolar, double quantidade){
		double iof = dolar*quantidade*6/100;
		System.out.print("Quantidade que será paga em reais: ");
		System.out.printf("%.2f", real = quantidade*dolar + iof);
	}

}
