package ecommerce.pos.models;

import ecommerce.pos.models.Contato;
import ecommerce.pos.models.Endereco;
import ecommerce.pos.models.Entidade;

public abstract class Pessoa extends Entidade{ //classe abstrata n�o pode ser instanciada
	    
    private String login;
    private String senha;
    private Contato contato; 		// Agrega��o de Contato � parte de do Todo Pessoa
    private Endereco endereco; 	// Agrega��o de Endere�o � parte de do Todo Pessoa

    // construtor da classe Pessoa
    public Pessoa(Integer codigo) {
        super.setCodigo(codigo);
        contato = new Contato();
        endereco = new Endereco();
    }

    public Pessoa() {
        contato = new Contato();
        endereco = new Endereco();
    }

    public Contato getContato() {
            return contato;
    }

    public Endereco getEndereco() {
            return endereco;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
	
    public void AdicionaContato(String telefone, String email){
            this.contato = new Contato(telefone,email);	// instanciando objeto Contato	
    }

    public void AdicionaEndereco(String logradouro, String numero, String bairro, String cidade, String estado, String cep) {
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
