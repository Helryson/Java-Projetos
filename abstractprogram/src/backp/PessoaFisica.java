package backp;

public class PessoaFisica extends Pessoa{
	
	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calcImposto() {
		if(rendaAnual >= 20000) {
			if(gastoSaude > 0) {
				return (rendaAnual/4) - (gastoSaude/2);
			}
			else return rendaAnual/4;
		}
		else{
			if(gastoSaude > 0) {
				return (rendaAnual/100*15) - (gastoSaude/2);
			}
			else {
				return rendaAnual/100*15;
			}
		}
	}
	
}
