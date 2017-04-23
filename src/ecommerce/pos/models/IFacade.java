package ecommerce.pos.models;

interface IFacade {

    void inicializarProdutos();    
    
    // metodos de pessoa
    void cadastrar(Pessoa pessoa);
    void editar(Pessoa pessoa);
    void excluir(Pessoa pessoa);
    Pessoa buscarPessoa(int codigo);
    Pessoa buscarPessoaPorLoginSenha(String login, String senha);
    
    // metodos de produto
    Produto buscarProduto(int codigo);
}
