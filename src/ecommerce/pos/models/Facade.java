package ecommerce.pos.models;

import ecommerce.pos.dao.PessoaDAO;

public class Facade implements IFacade{      
    
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
