package ecommerce.pos.models;

public class PessoaFisicaFuncinario extends PessoaFisica {
	
	private int carteiratrabalho;
	
		
	public PessoaFisicaFuncinario(int codigo, String nome, String datanascimento, String rg, String cpf, int carteiratrabalho)
	{
		super(codigo, nome, datanascimento, rg, cpf);
		this.carteiratrabalho = carteiratrabalho;
	}

	
	public int getCarteiratrabalho() {
		return carteiratrabalho;
	}
	public void setCarteiratrabalho(int carteiratrabalho) {
		this.carteiratrabalho = carteiratrabalho;
	}
}
