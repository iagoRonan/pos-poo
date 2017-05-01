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
public class ExcecaoEdicao extends RuntimeException {

    public ExcecaoEdicao() {
        super("Não é possível Editar um objeto sem código, Tente novamente!");
    }
    
}
