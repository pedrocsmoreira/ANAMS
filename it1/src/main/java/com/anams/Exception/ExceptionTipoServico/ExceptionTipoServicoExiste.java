package com.anams.Exception.ExceptionTipoServico;

public class ExceptionTipoServicoExiste extends Exception{
    public ExceptionTipoServicoExiste(){
        super();
    }

    public ExceptionTipoServicoExiste(String message){
        super(message);
    }
}
