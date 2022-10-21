package com.anams.Exception.ExceptionEspecialidade;

public class ExceptionEspecialidadeNaoExiste extends Exception{
    public ExceptionEspecialidadeNaoExiste(){
        super();
    }

    public ExceptionEspecialidadeNaoExiste(String message){
        super(message);
    }
}