package entities;

public class Pensionato {
	private String nome;
	private String email;
	private int quarto;
	private boolean ocupado;
	
	public Pensionato(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
		this.ocupado = false;
	}

	public int getQuarto() {
		return quarto;
	}
	
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	public boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return quarto + ": " + nome + ", " + email;
		
	}
	
}
