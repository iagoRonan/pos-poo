package ecommerce.pos.dao;

import ecommerce.pos.models.FormaPagamento;
import ecommmerce.pos.execoes.ExcecaoBuscar;
import ecommmerce.pos.execoes.ExcecaoEdicao;
import ecommmerce.pos.execoes.ExcecaoExcluir;
import java.util.ArrayList;
import java.util.List;

public class FormaPagamentoDAO {

    private List<FormaPagamento> listaFormaPagamentos;

    public FormaPagamentoDAO() {
        listaFormaPagamentos = new ArrayList<>();
    }

    public List<FormaPagamento> getListaFormaPagamentos() {
        return listaFormaPagamentos;
    }

    public void setListaFormaPagamentos(List<FormaPagamento> listaFormaPagamentos) {
        this.listaFormaPagamentos = listaFormaPagamentos;
    }
    
    public void cadastrar(FormaPagamento formaPagamento){
        listaFormaPagamentos.add(formaPagamento);
    }
    
    public void editar(FormaPagamento formaPagamento){        
        if (formaPagamento != null && formaPagamento.getCodigo() != null){
            for (FormaPagamento p : listaFormaPagamentos) {
                if (p.getCodigo().equals(formaPagamento.getCodigo())) {
                    listaFormaPagamentos.set(listaFormaPagamentos.indexOf(p), formaPagamento);
                }
            }
        }else{
            throw new ExcecaoEdicao();
        }        
    }
    
    public void excluir(FormaPagamento formaPagamento){
        if (formaPagamento != null && formaPagamento.getCodigo() != null) {
            for (FormaPagamento p : listaFormaPagamentos) {
                if (p.getCodigo().equals(formaPagamento.getCodigo())) {
                    listaFormaPagamentos.remove(listaFormaPagamentos.indexOf(p));
                }
            }
        }else{
            throw new ExcecaoExcluir();
        }
    }
    
    public FormaPagamento buscar(Integer codigo){                
        
        if (codigo != null) {
            for (FormaPagamento p : listaFormaPagamentos) {
                if (codigo == p.getCodigo())
                    return p;                
            }
        }else{
            throw new ExcecaoBuscar();
        }
        
        return null;
    }
}
