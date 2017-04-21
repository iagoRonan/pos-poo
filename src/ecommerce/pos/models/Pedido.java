package ecommerce.pos.models;

public class Pedido {
	// Encapsulamento de todos os atributos;
	private int codPedido;
	private Pessoa cliente;
	private ItemPedido Itens[];	// vetor Utilizado para armazenar os produtos do pedido;
	private FormaPagamento pagamento;
	private float valorTotal;
	
	//Contrutor 1
	public Pedido(int codPedido, Pessoa cliente, int qtd) {
		this.codPedido = codPedido;
		Itens = new ItemPedido[qtd];
		this.cliente = cliente;
		}
	
	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public ItemPedido[] getListaItens() {
		return Itens;
	}

	public void AdicionandoItemLista(ItemPedido Itens, int posicao) {
		this.Itens[posicao] = Itens;
	}
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float CalculoValorTotal() {
		this.valorTotal = 0;
		for (int x=0;x<Itens.length;x++){
		this.valorTotal = this.valorTotal + this.Itens[x].getsubtotal();}
		return valorTotal;
	}

	public float CalculoValorTotal2(float... subtotal) { // aqui usado medoto de argumentos variados.
		float total = 0;
        for(float d: subtotal)
        total+=d;	 // Somando os argumentos
        return total; // Retornando a média
  }

	public static float desconto(float valor, float taxa){
		float novovalor = valor*(1-taxa);
		return novovalor;
	}
	
	public void mostrarPedido(){
		System.out.println("<------------------------------- FOLHA DE PEDIDO ----------------------------->");
		System.out.println("Codigo do pedido: "+ this.codPedido);
		System.out.println("<----------------------------Dados do cliente: ------------------------------>");
		cliente.mostrardados();
		System.out.println("<-----------------------------Dados do pedido: ------------------------------>");
		for (int x=0;x<Itens.length;x++){	
			System.out.print("Itens: "+ this.Itens[x].getProduto().getDescricao() + "			");
			System.out.println("genero: "+ this.Itens[x].getProduto().getTipo()+ "			");
			System.out.println("subtotal: "+ this.Itens[x].getsubtotal());
			}
		if(this.Itens.length == 5){
		System.out.println("Total:	"+ this.CalculoValorTotal2(this.Itens[0].getsubtotal(),this.Itens[1].getsubtotal(),this.Itens[2].getsubtotal(),this.Itens[3].getsubtotal(),this.Itens[4].getsubtotal(),this.Itens[5].getsubtotal()));
		}else{System.out.println("Total:  "+ this.CalculoValorTotal());}
		System.out.println("<---------------------------Dados Forma de Pagamento: ----------------------->");
		System.out.println(pagamento.toString());
		
	}
}
