/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.execoes;

/**
 *
 * @author iago
 */
public class ExcecaoExcluir extends RuntimeException {

    public ExcecaoExcluir() {
        super("Não foi possível excluir esse objeto, o mesmo está sem código. Tente novamente!");
    }
        
}
