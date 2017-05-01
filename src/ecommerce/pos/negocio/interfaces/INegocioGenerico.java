/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.pos.negocio.interfaces;

import ecommerce.pos.models.Entidade;
import java.util.List;

/**
 *
 * @author iago
 */
public interface INegocioGenerico<T extends Entidade> {
    
    void inserir(T t);
    void alterar(T t);
    void excluir(T t);
    T buscar(Integer codigo);
    List<T> listar();
}
