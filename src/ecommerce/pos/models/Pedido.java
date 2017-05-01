package ecommerce.pos.models;

public class Pedido extends Entidade{
    
    // Encapsulamento de todos os atributos;
    private Pessoa cliente;
    private ItemPedido itens[];	// vetor Utilizado para armazenar os produtos do pedido;
    private FormaPagamento pagamento;
    private float valorTotal;

    //Contrutor 1
    public Pedido(Pessoa cliente, int qtd) {        
        itens = new ItemPedido[qtd];
        this.cliente = cliente;
    }

    public Pedido() {

    }

    public FormaPagamento getPagamento() {
            return pagamento;
    }

    public void setPagamento(FormaPagamento pagamento) {
            this.pagamento = pagamento;
    }

    public Pessoa getCliente() {
            return cliente;
    }

    public void setCliente(Pessoa cliente) {
            this.cliente = cliente;
    }

    public ItemPedido[] getListaItens() {
            return itens;
    }

    public void AdicionandoItemLista(ItemPedido item) {            
        this.itens[this.itens.length-1] = item;
    }


    public float getValorTotal() {
            return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
            this.valorTotal = valorTotal;
    }

    public float CalculoValorTotal() {
            this.valorTotal = 0;
            for (int x=0;x<itens.length;x++){
            this.valorTotal = this.valorTotal + this.itens[x].getsubtotal();}
            return valorTotal;
    }

    public float CalculoValorTotal2(float... subtotal) { // aqui usado medoto de argumentos variados.
            float total = 0;
    for(float d: subtotal)
    total+=d;	 // Somando os argumentos
    return total; // Retornando a m�dia
}

    public static float desconto(float valor, float taxa){
            float novovalor = valor*(1-taxa);
            return novovalor;
    }

    public void mostrarPedido(){
            System.out.println("<------------------------------- FOLHA DE PEDIDO ----------------------------->");
            System.out.println("Codigo do pedido: "+ getCodigo());
            System.out.println("<----------------------------Dados do cliente: ------------------------------>");
            cliente.mostrardados();
            System.out.println("<-----------------------------Dados do pedido: ------------------------------>");
            for (int x=0;x<itens.length;x++){	
                    System.out.print("Itens: "+ this.itens[x].getProduto().getDescricao() + "			");
                    System.out.println("genero: "+ this.itens[x].getProduto().getTipo()+ "			");
                    System.out.println("subtotal: "+ this.itens[x].getsubtotal());
                    }
            if(this.itens.length == 5){
            System.out.println("Total:	"+ this.CalculoValorTotal2(this.itens[0].getsubtotal(),this.itens[1].getsubtotal(),this.itens[2].getsubtotal(),this.itens[3].getsubtotal(),this.itens[4].getsubtotal(),this.itens[5].getsubtotal()));
            }else{System.out.println("Total:  "+ this.CalculoValorTotal());}
            System.out.println("<---------------------------Dados Forma de Pagamento: ----------------------->");
            System.out.println(pagamento.toString());

    }
}
