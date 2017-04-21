package ecommerce.pos.models;

public abstract class Pessoa { //classe abstrata n�o pode ser instanciada
	
	protected Integer codigo;
	protected Contato contato; 		// Agrega��o de Contato � parte de do Todo Pessoa
	protected Endereco endereco; 	// Agrega��o de Endere�o � parte de do Todo Pessoa

	// construtor da classe Pessoa
	public Pessoa(int codigo) {
		this.codigo = codigo;
	}
	
	public Contato getContato() {
		return contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

	
	
	public void AdicionaContato(String telefone, String email){
		this.contato = new Contato(telefone,email);	// instanciando objeto Contato	
	}
	
	public void AdicionaEndereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado,cep); // Instanciando Objeto Endere�o
		}

	public void mostrardados(){
		System.out.println("Codigo da Pessoa: "+ this.getCodigo());
		System.out.println("******************Dados do contato****************");
		System.out.println(contato.toString());
		System.out.println("********************Dados do endere�o**************");
		System.out.println(endereco.toString());
	}




}
