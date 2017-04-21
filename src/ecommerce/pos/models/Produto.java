package ecommerce.pos.models;

public class Produto {
    private int codigo;
    private String Descricao;
    private float valorProduto;
    private enum genero{componetes, perifericos, conectivade, seguranca, automacao, multimidia}; //Usso de Enumeradores para descriminar tipos comuns de mercadoris;

private int qtdProduto;
genero tipo;

		public Produto(int codigo, String descricao, float valorProduto, int generoItem) { // construtor utilizado pela classe itemPedido
			this.codigo = codigo;
			this.Descricao = descricao;
			this.valorProduto = valorProduto;
			this.obtergenero(generoItem);
		}
		
		public Produto(int codigo, String descricao, float valorProduto, int generoItem, int qtdProduto) { // construtor utilizado para uma inser��o em estoque
			this.codigo = codigo;
			this.Descricao = descricao;
			this.valorProduto = valorProduto;
			this.obtergenero(generoItem);
			this.qtdProduto = qtdProduto;
		}
		
       public void obtergenero(int valor)
       {
    	   switch(valor)
           {
                   case 0: tipo = genero.componetes; break;
                   case 1: tipo = genero.perifericos; break;
                   case 2: tipo = genero.conectivade; break;
                   case 3: tipo = genero.seguranca; break;
                   case 4: tipo = genero.automacao; break;
                   case 5: tipo = genero.multimidia; break;
           }
       }
    

		
        public genero getTipo() {
		return tipo;
	}

	public void setTipo(genero tipo) {
		this.tipo = tipo;
	}

		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		public float getValorProduto() {
			return valorProduto;
		}
		public void setValorProduto(float valorProduto) {
			this.valorProduto = valorProduto;
		}
		
		public int getqtdProduto() {
			return qtdProduto;
		}
		public void setqtdProduto(int qtdProduto) {
			this.qtdProduto = qtdProduto;
		}
		public void retirarProduto(int qtdretirada){
			this.qtdProduto = this.qtdProduto - qtdretirada;
		}
		public void adicionarProduto(int qtdadicionada){
			this.qtdProduto = this.qtdProduto + qtdadicionada;
		}
}
