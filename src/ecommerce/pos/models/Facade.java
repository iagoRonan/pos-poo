package ecommerce.pos.models;

import ecommerce.pos.dao.FormaPagamentoDAO;
import ecommerce.pos.dao.PessoaDAO;
import ecommerce.pos.dao.ProdutoDAO;
import java.util.List;

public class Facade implements IFacade{      
    
    private PessoaDAO pessoaDAO;
    private ProdutoDAO produtoDAO;
    private FormaPagamentoDAO formaPagamentoDAO;
    
    @Override
    public void incializarProdutos() {
        produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrar(new Produto(10, "impressora",35,1,100));
        produtoDAO.cadastrar(new Produto(11, "MicroSystem",550, 2,80));
        produtoDAO.cadastrar(new Produto(12, "Faqueiro Ipanema",75, 3,70));
        produtoDAO.cadastrar(new Produto(13, "Mangueira de Jardim",19, 4,80));
        produtoDAO.cadastrar(new Produto(14, "Mouse multilaser",25,5,90));
    }

    public List<Produto> getProdutos(){
        return produtoDAO.getListaProdutos();
    }
    
    @Override
    public Pessoa buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Pessoa pessoa) {
        PessoaDAO dao = new PessoaDAO();
        dao.cadastrar(pessoa);
    }

    @Override
    public void editar(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
