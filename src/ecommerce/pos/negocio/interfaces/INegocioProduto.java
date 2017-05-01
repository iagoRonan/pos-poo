/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.negocio.interfaces;

import ecommerce.pos.models.Produto;

/**
 *
 * @author iago
 */
public interface INegocioProduto extends INegocioGenerico<Produto> {
    
    void inicializar();
}
