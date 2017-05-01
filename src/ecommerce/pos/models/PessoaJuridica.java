package ecommerce.pos.models;

import ecommerce.pos.models.interfaces.IPessoaAutenticavel;

public class PessoaJuridica extends Pessoa implements IPessoaAutenticavel {
    
    private String razaosocial;
    private String nomefantasia;
    private String cnpj;
    
    public PessoaJuridica(int codigo, String razaosocial, String nomefantasia, String cnpj) {
            super(codigo); // Heran�a construtor da da superclase Pessoa
            this.razaosocial = razaosocial;
            this.nomefantasia = nomefantasia;
            this.cnpj = cnpj;
    }

    public PessoaJuridica() {

    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
	
	
    public void mostrardados(){
            super.mostrardados();
            System.out.println("*****************Dados da Pessoa Juricdica***************");
            System.out.println("Razao Social: "+ this.razaosocial);
            System.out.println("Nome Fantasia: "+ this.nomefantasia);
            System.out.println("CNPJ: "+ this.cnpj);	
    }
	
    public boolean Autenticacao(String login, String senha)  // Implementa��o do metodo  da interface
    {
        return login == "clientePJ" && senha == "1234";            
    }
}