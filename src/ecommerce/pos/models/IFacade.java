package ecommerce.pos.models;

interface IFacade {

    // metodos de pessoa
    void cadastrar(Pessoa pessoa);
    void editar(Pessoa pessoa);
    void excluir(Pessoa pessoa);
    Pessoa buscar(int codigo);
    
}
