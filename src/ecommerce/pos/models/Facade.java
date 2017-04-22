package ecommerce.pos.models;

import ecommerce.pos.dao.FormaPagamentoDAO;
import ecommerce.pos.dao.PessoaDAO;
import ecommerce.pos.dao.ProdutoDAO;
import ecommerce.pos.enumerador.GeneroProduto;
import java.util.List;

public class Facade implements IFacade{      
    
    private PessoaDAO pessoaDAO;
    private ProdutoDAO produtoDAO;
    private FormaPagamentoDAO formaPagamentoDAO;
    
    @Override
    public void incializarProdutos() {
        produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrar(new Produto(10, "impressora",35, GeneroProduto.PERIFERICOS ,100));
        produtoDAO.cadastrar(new Produto(11, "MicroSystem",550, GeneroProduto.COMPONETES,80));
        produtoDAO.cadastrar(new Produto(12, "Antivírus",75, GeneroProduto.SEGURANCA,70));
        produtoDAO.cadastrar(new Produto(13, "Windows 7",19, GeneroProduto.SISTEMA_OPERACIONAL,80));
        produtoDAO.cadastrar(new Produto(14, "Mouse multilaser",25,GeneroProduto.PERIFERICOS,90));
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
