package ecommerce.pos.negocio;

import ecommerce.pos.models.Entidade;
import ecommerce.pos.negocio.interfaces.INegocioGenerico;
import ecommerce.pos.repositorio.RepositorioGenerico;
import ecommerce.pos.repositorio.interfaces.IRepositorioGenerico;
import java.util.List;

public class NegocioGenerico<T extends Entidade> implements INegocioGenerico<T>{

    private IRepositorioGenerico<T> repositorio;

    public NegocioGenerico(IRepositorioGenerico<T> repositorio) {
        this.repositorio = repositorio;
    }
    
    public IRepositorioGenerico<T> getRepositorio() {
        return repositorio;
    }

    public NegocioGenerico() {
        repositorio = new RepositorioGenerico<>();
    }
    
    @Override
    public void inserir(T t) {
        repositorio.inserir(t);        
    }

    @Override
    public void alterar(T t) {
        repositorio.alterar(t);
    }

    @Override
    public void excluir(T t) {
        repositorio.excluir(t);
    }

    @Override
    public T buscar(Integer codigo) {
        return repositorio.buscar(codigo);
    }

    @Override
    public List<T> listar() {
        return repositorio.listar();
    }
    
}
