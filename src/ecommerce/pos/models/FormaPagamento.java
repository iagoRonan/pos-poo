package ecommerce.pos.models;

public class FormaPagamento extends Entidade {

    private String dataPagamento;
    private boolean confirmacaoPagamento = false;

    public FormaPagamento(Integer codigo) {
            super.setCodigo(codigo);
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
		return "FormaPagamento [codPagamento: " + getCodigo() + "\n dataPagamento=" + dataPagamento
				+ ", confirmacaoPagamento=" + confirmacaoPagamento + "]";
	}
	
	
}
