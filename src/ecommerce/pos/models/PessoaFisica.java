package ecommerce.pos.models;

public class PessoaFisica extends Pessoa implements IPessoaAutenticavel{
// Aqui é uma especialização
	private String nome;
	private String datanascimento;
	private String rg;
	private String cpf;
	
	public PessoaFisica(int codigo, String nome, String datanascimento, String rg, String cpf) {
		super(codigo);	// Herança da super classe pessoa
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void mostrardados(){
		super.mostrardados();
		System.out.println("**************** Dados da Pessoa Fisica ***************");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Nascimento: "+ this.datanascimento);
		System.out.println("RG: "+ this.rg);
		System.out.println("CPF: "+ this.cpf);
	}
	
	public boolean Autenticacao(String login, String senha)  // Implementaï¿½ï¿½o de mï¿½todo da interface
	{
		if(login != "clientePF" && senha != "1234"){
		return false;}
		return true;}
}
	

