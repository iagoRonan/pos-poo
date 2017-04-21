package ecommerce.pos.models;

public class FormaPagamento {

	private int codPagamento;
	private String dataPagamento;
	private boolean confirmacaoPagamento = false;
	
	public FormaPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}

	public int getCodPagamento() {
		return codPagamento;
	}
	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}
	
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void realizaPagamento(boolean flag, String data){
		if (flag){
			System.out.println("\npagamento realizado!");
			confirmacaoPagamento = true;
			this.dataPagamento = data;
		}else{
			confirmacaoPagamento = false;
		}
	}

	@Override
	public String toString() {
		return "FormaPagamento [codPagamento: " + codPagamento + "\n dataPagamento=" + dataPagamento
				+ ", confirmacaoPagamento=" + confirmacaoPagamento + "]";
	}
	
	
}
