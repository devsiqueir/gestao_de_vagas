package br.com.devsiqueira.gestao_de_vagas.exceptions;

public class UseFoundException extends RuntimeException{
    public UseFoundException() {
        super("Usuário já existe");
    }
}
