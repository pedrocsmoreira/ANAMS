package com.anams.Exception.ExceptionTipoServico;

public class ExceptionTipoServicoNaoExiste extends Exception{
    public ExceptionTipoServicoNaoExiste(){
        super();
    }

    public ExceptionTipoServicoNaoExiste(String message){
        super(message);
    }
}
