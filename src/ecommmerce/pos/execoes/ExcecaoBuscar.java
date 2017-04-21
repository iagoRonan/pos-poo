/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommmerce.pos.execoes;

/**
 *
 * @author iago
 */
public class ExcecaoBuscar extends RuntimeException {

    public ExcecaoBuscar() {
        super("Impossível buscar um objeto sem código!");
    }
    
}
