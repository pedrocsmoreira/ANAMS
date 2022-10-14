package com.anams.Exception.ExceptionConvencao;

public class ExceptionConvencaoNaoExiste extends Exception{
    public ExceptionConvencaoNaoExiste(){
        super();
    }

    public ExceptionConvencaoNaoExiste(String message){
        super(message);
    }
}
