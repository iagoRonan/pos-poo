package ecommerce.pos.dao;

import ecommerce.pos.models.Pessoa;
import ecommerce.pos.models.PessoaFisica;
import ecommmerce.pos.execoes.ExcecaoBuscar;
import ecommmerce.pos.execoes.ExcecaoEdicao;
import ecommmerce.pos.execoes.ExcecaoExcluir;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private List<Pessoa> listaPessoas;

    public PessoaDAO() {
        listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    public void cadastrar(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }
    
    public void editar(Pessoa pessoa){        
        if (pessoa != null && pessoa.getCodigo() != null){
            for (Pessoa p : listaPessoas) {
                if (p.getCodigo().equals(pessoa.getCodigo())) {
                    listaPessoas.set(listaPessoas.indexOf(p), pessoa);
                }
            }
        }else{
            throw new ExcecaoEdicao();
        }        
    }
    
    public void excluir(Pessoa pessoa){
        if (pessoa != null && pessoa.getCodigo() != null) {
            for (Pessoa p : listaPessoas) {
                if (p.getCodigo().equals(pessoa.getCodigo())) {
                    listaPessoas.remove(listaPessoas.indexOf(p));
                }
            }
        }else{
            throw new ExcecaoExcluir();
        }
    }
    
    public Pessoa buscar(Integer codigo){                
        
        if (codigo != null) {
            for (Pessoa p : listaPessoas) {
                if (codigo == p.getCodigo())
                    return p;                
            }
        }else{
            throw new ExcecaoBuscar();
        }
        
        return null;
    }
     
    public Pessoa buscarPessoaPorLoginSenha(String login, String senha){
        
        if (login != null && senha != null) {
            for (Pessoa p : listaPessoas) {
                if (p.getLogin().equals(login) && p.getSenha().equals(senha)){                    
                    return p;
                }                    
            }
        }
        
        return null;
    }
}
