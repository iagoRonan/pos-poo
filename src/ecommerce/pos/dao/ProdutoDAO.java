package ecommerce.pos.dao;

import ecommerce.pos.models.Produto;
import ecommmerce.pos.execoes.ExcecaoBuscar;
import ecommmerce.pos.execoes.ExcecaoEdicao;
import ecommmerce.pos.execoes.ExcecaoExcluir;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private List<Produto> listaProdutos;

    public ProdutoDAO() {
        listaProdutos = new ArrayList<>();
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    public void cadastrar(Produto produto){
        listaProdutos.add(produto);
    }
    
    public void editar(Produto produto){        
        if (produto != null && produto.getCodigo() != null){
            for (Produto p : listaProdutos) {
                if (p.getCodigo().equals(produto.getCodigo())) {
                    listaProdutos.set(listaProdutos.indexOf(p), produto);
                }
            }
        }else{
            throw new ExcecaoEdicao();
        }        
    }
    
    public void excluir(Produto produto){
        if (produto != null && produto.getCodigo() != null) {
            for (Produto p : listaProdutos) {
                if (p.getCodigo().equals(produto.getCodigo())) {
                    listaProdutos.remove(listaProdutos.indexOf(p));
                }
            }
        }else{
            throw new ExcecaoExcluir();
        }
    }
    
    public Produto buscar(Integer codigo){                
        
        if (codigo != null) {
            for (Produto p : listaProdutos) {
                if (codigo == p.getCodigo())
                    return p;                
            }
        }else{
            throw new ExcecaoBuscar();
        }
        
        return null;
    }
        
}
