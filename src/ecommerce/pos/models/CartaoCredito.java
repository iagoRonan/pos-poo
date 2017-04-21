package ecommerce.pos.models;

public class CartaoCredito extends FormaPagamento {

	private String bandeira;
	private String operacao;
	private int QtddVezes;
	private String titular;
	private String validade;
	private String numero;
	private String codigoSeguranca;
	
	
	public CartaoCredito(int codPagamento,String bandeira, String operacao, int qtddVezes, String titular, String validade, String numero,
			String codigoSeguranca){
		super(codPagamento);
		this.bandeira = bandeira;
		this.operacao = operacao;
		QtddVezes = qtddVezes;
		this.titular = titular;
		this.validade = validade;
		this.numero = numero;
		this.codigoSeguranca = codigoSeguranca;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getoperacao() {
		return operacao;
	}
	public void setoperacao(String operacao) {
		this.operacao = operacao;
	}
	public int getQtddVezes() {
		return QtddVezes;
	}
	public void setQtddVezes(int qtddVezes) {
		QtddVezes = qtddVezes;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getcodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setcodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	@Override
	public String toString() {
		return "\nCartaoCredito \nbandeira: " + bandeira + " \noperacao: " + operacao + "\nQtddVezes: " + QtddVezes
				+ "\ntitular: " + titular + "\nvalidade: " + validade + "\nnumero: " + numero + "\ncodigoSeguranca: "
				+ codigoSeguranca;
	}
	
}
