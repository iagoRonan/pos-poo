/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.enumerador;

/**
 *
 * @author iago
 */
public enum TipoBanco {
    
    BANCO_DO_BRASIL(1, "BANCO DO BRASIL"),
    CAIXA_ECONOMICA_FEDERAL(2, "CAIXA ECONÔMICA FEDERAL"),
    SANTANDER(3, "SANTANDER"),
    ITAU(4, "ITAU"),
    BRADESCO(5, "BRADESCO");
    
    private Integer codigo;
    private String descricao;

    private TipoBanco(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
