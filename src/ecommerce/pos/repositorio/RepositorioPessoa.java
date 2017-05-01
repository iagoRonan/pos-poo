/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.repositorio;

import ecommerce.pos.execoes.ExcecaoBuscar;
import ecommerce.pos.models.Entidade;
import ecommerce.pos.models.Pessoa;
import ecommerce.pos.repositorio.interfaces.IRepositorioPessoa;
import java.util.List;

/**
 *
 * @author iago
 */
public class RepositorioPessoa extends RepositorioGenerico<Pessoa> implements IRepositorioPessoa{

    @Override
    public Pessoa buscarPorLoginSenha(String login, String senha) {
        
        List<Pessoa> listaPessoas = super.listar();
        
        for (Pessoa p : listaPessoas) {
            if (login.equals(p.getLogin()) && senha.equals(p.getSenha())) {
                return p;
            }
        }                
        
        return null;        
    }
    
}
