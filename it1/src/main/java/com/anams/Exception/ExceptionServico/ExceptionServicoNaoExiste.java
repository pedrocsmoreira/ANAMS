package com.anams.Exception.ExceptionServico;

public class ExceptionServicoNaoExiste extends Exception{
    public ExceptionServicoNaoExiste(){
        super();
    }

    public ExceptionServicoNaoExiste(String message){
        super(message);
    }
}