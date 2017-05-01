/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.negocio;

import ecommerce.pos.models.Pessoa;
import ecommerce.pos.models.PessoaFisica;
import ecommerce.pos.negocio.interfaces.INegocioPessoa;
import ecommerce.pos.repositorio.RepositorioPessoa;
import ecommerce.pos.repositorio.interfaces.IRepositorioPessoa;

/**
 *
 * @author iago
 */
public class NegocioPessoa extends NegocioGenerico<Pessoa> implements INegocioPessoa {
    
    public NegocioPessoa() {
        super(new RepositorioPessoa());        
    }
    
    @Override
    public void inicializar() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("ADMINISTRADOR");
        pessoa.setLogin("1");
        pessoa.setSenha("1");
        
        pessoa.getEndereco().setCep("48907620");
        pessoa.getEndereco().setCidade("JUAZEIRO");
        pessoa.getEndereco().setEstado("BA");
        pessoa.getEndereco().setLogradouro("RUA 01");
        pessoa.getEndereco().setNumero("100");
        pessoa.getEndereco().setBairro("ALTO DA ALIANÇA");
        
        pessoa.getContato().setEmail("adm@gmail.com");
        pessoa.getContato().setTelefone("(87) 98105-9987");
        
        inserir(pessoa);
    }

    @Override
    public Pessoa buscarPorLoginSenha(String login, String senha) {
        return ((IRepositorioPessoa)getRepositorio()).buscarPorLoginSenha(login, senha);
    }
    
}
