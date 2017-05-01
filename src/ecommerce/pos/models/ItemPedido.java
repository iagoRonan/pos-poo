package ecommerce.pos.models;

public class ItemPedido extends Entidade{
	
    private Produto produto;
    private int qtdItem;
    private float subtotal;

    public ItemPedido(Integer codigo, Produto produto, int qtdItem) {
            super();
            super.setCodigo(codigo);		
            this.produto = produto;
            this.qtdItem = qtdItem;
            produto.retirarProduto(qtdItem);
    }	

    public Produto getProduto() {
            return produto;}

    public void setProduto(Produto produto) {
            this.produto = produto;}

    public int getQtdItem() {
            return qtdItem;}

    public void setQtdItem(int qtdItem) {
            this.qtdItem = qtdItem;}

    public float getsubtotal(){
            this.subtotal = produto.getValorProduto()*this.qtdItem;
            return subtotal;
    }

}
