package com.anams.Exception.ExceptionMedico;

public class ExceptionMedicoNaoExiste extends Exception{
    public ExceptionMedicoNaoExiste(){
        super();
    }

    public ExceptionMedicoNaoExiste(String message){
        super(message);
    }
}