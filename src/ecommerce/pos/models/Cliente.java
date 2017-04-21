package ecommerce.pos.models;

public class Cliente {

	private Pessoa lista[];
	
	public Cliente() {
		this.lista = new Pessoa[100];		
	}
	
	public Pessoa getLista(int posicao) {
		return lista[posicao];
	}

	public void setListaItens(Pessoa cliente, int posicao) {
		this.lista[posicao] = cliente;
	}
		

}
