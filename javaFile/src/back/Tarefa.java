package back;

import java.util.Date;

public class Tarefa {
	
	private String desc;
	private Date prazo;
	private String titulo;
	private Status status;
	
	public Tarefa(String desc, Date prazo, String titulo) {
		this.desc = desc;
		this.prazo = prazo;
		this.titulo = titulo;
		this.status = status.EM_ABERTO;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getPrazo() {
		return prazo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Status getStatus() {
		return status;
	}
	
	public 
	
}
