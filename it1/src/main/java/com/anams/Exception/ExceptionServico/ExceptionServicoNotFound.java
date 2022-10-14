package com.anams.Exception.ExceptionServico;

public class ExceptionServicoNotFound extends Exception{
    public ExceptionServicoNotFound(){
        super();
    }

    public ExceptionServicoNotFound(String message){
        super(message);
    }
}