package com.anams.Exception.ExceptionMedico;

public class ExceptionMedicoNotFound extends Exception{
    public ExceptionMedicoNotFound(){
        super();
    }

    public ExceptionMedicoNotFound(String message){
        super(message);
    }
}