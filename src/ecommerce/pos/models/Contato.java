package ecommerce.pos.models;

public class Contato {

	private String telefone;
	private String email;
		
	// Construtor chamado quando se instancia a classe Pessoa
	public Contato(){
	}
	// sobrecarga do construtor utilizado pelo metodo "adicionacontato" classe Pessoa 
	public Contato(String telefone, String email) {
		this.telefone = telefone;
		this.email = email;	
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "telefone: " + telefone + "\nemail: " + email;
	}
	
	}
