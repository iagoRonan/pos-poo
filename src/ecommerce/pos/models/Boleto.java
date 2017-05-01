package ecommerce.pos.models;

import ecommerce.pos.enumerador.TipoBanco;

public class Boleto extends FormaPagamento{

	private String dataVencimento;
	private String Codigodebarras;
	private String Banco;
	
	
	public Boleto(int codPagamento, String dataVencimento, String Codigodebarras, String banco) {
		super(codPagamento);
		this.dataVencimento = dataVencimento;
		this.Codigodebarras = Codigodebarras;
		this.Banco = banco;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getNumero() {
		return Codigodebarras;
	}
	public void setNumero(String Codigodebarras) {
		this.Codigodebarras = Codigodebarras;
	}
	public String getBanco() {
		return Banco;
	}
	public void setBanco(String banco) {
		Banco = banco;
	}
	@Override
	public String toString() {
		return "Boleto \ndataVencimento: " + dataVencimento + "\nCodigodebarras: " + Codigodebarras + "\nBanco:" + Banco;
	}
	
	
	
}
