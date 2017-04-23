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

    public Facade() {
        pessoaDAO = new PessoaDAO();
        produtoDAO = new ProdutoDAO();
        formaPagamentoDAO = new FormaPagamentoDAO();
        
        inicializarPessoas();
        inicializarProdutos();
    }
    
    @Override
    public void inicializarProdutos() {        
        produtoDAO.cadastrar(new Produto(10, "impressora",35, GeneroProduto.PERIFERICOS ,100));
        produtoDAO.cadastrar(new Produto(11, "MicroSystem",550, GeneroProduto.COMPONETES,80));
        produtoDAO.cadastrar(new Produto(12, "Antivírus",75, GeneroProduto.SEGURANCA,70));
        produtoDAO.cadastrar(new Produto(13, "Windows 7",19, GeneroProduto.SISTEMA_OPERACIONAL,80));
        produtoDAO.cadastrar(new Produto(14, "Mouse multilaser",25,GeneroProduto.PERIFERICOS,90));
    }   
    
    public void inicializarPessoas(){
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("ADMINISTRADOR");
        pessoa.setLogin("1");
        pessoa.setSenha("1");
        pessoaDAO.cadastrar(pessoa);
    }
    
    public List<Produto> getProdutos(){
        return produtoDAO.getListaProdutos();
    }
    
    @Override
    public Pessoa buscarPessoaPorLoginSenha(String login, String senha) {
        return pessoaDAO.buscarPessoaPorLoginSenha(login, senha);
    }
       
    @Override
    public void cadastrar(Pessoa pessoa) {        
        pessoaDAO.cadastrar(pessoa);        
    }

    @Override
    public void editar(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa buscarPessoa(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto buscarProduto(int codigo) {
        return produtoDAO.buscar(codigo);
    }

    

    

    
    
}
