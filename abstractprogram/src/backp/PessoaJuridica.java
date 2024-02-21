package backp;

public class PessoaJuridica extends Pessoa {

	private int numFuncio;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numFuncio) {
		super(nome, rendaAnual);
		this.numFuncio = numFuncio;
	}

	public int getNumFuncio() {
		return numFuncio;
	}

	public void setNumFuncio(int numFuncio) {
		this.numFuncio = numFuncio;
	}

	@Override
	public Double calcImposto() {
		if (numFuncio <= 10) {
			return rendaAnual/100*16;
		}
		else {
			return rendaAnual/100*14;
		}
	}

}
