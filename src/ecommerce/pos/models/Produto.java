package ecommerce.pos.models;

import ecommerce.pos.enumerador.GeneroProduto;

public class Produto extends Entidade{
    
    private String Descricao;
    private float valorProduto;
    //private enum genero{componetes, perifericos, conectivade, seguranca, automacao, multimidia}; //Usso de Enumeradores para descriminar tipos comuns de mercadoris;

    private int qtdProduto;
    private GeneroProduto tipo;
    //genero tipo;

    public Produto(Integer codigo, String descricao, float valorProduto, GeneroProduto tipo) { // construtor utilizado pela classe itemPedido
            super.setCodigo(codigo);
            this.Descricao = descricao;
            this.valorProduto = valorProduto;
            this.tipo = tipo;
            //this.obtergenero(generoItem);
    }

    public Produto(Integer codigo, String descricao, float valorProduto, GeneroProduto tipo, int qtdProduto) { // construtor utilizado para uma inser��o em estoque
            super.setCodigo(codigo);
            this.Descricao = descricao;
            this.valorProduto = valorProduto;
            this.tipo = tipo;
            //this.obtergenero(generoItem);
            this.qtdProduto = qtdProduto;
    }
		
       //public void obtergenero(int valor)
       /*public void obtergenero(GeneroProduto genero)
       {
    	   switch(valor)
           {
                   /*case 0: tipo = genero.componetes; break;
                   case 1: tipo = genero.perifericos; break;
                   case 2: tipo = genero.conectivade; break;
                   case 3: tipo = genero.seguranca; break;
                   case 4: tipo = genero.automacao; break;
                   case 5: tipo = genero.multimidia; break;
           }
       }*/
    

		
        public GeneroProduto getTipo() {
		return tipo;
	}

	public void setTipo(GeneroProduto tipo) {
		this.tipo = tipo;
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
