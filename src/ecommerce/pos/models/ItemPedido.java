package ecommerce.pos.models;

public class ItemPedido {

	private int codItem;
	private Produto produto;
	private int qtdItem;
	private float subtotal;
	
	public ItemPedido(int codItem, Produto produto, int qtdItem) {
		super();
		this.codItem = codItem;
		this.produto = produto;
		this.qtdItem = qtdItem;
		produto.retirarProduto(qtdItem);
	}

	public int getCodItem() {
		return codItem;}
	public void setCodItem(int codItem) {
		this.codItem = codItem;}
	
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
