package ecommerce.pos.models;

public interface IPessoaAutenticavel {
        
    abstract boolean Autenticacao(String login, String senha);

}
