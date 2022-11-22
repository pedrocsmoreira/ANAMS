package com.anams.Exception.ExceptionCliente;

public class ExceptionClienteExiste extends Exception{
    public ExceptionClienteExiste(){
        super();
    }

    public ExceptionClienteExiste(String message){
        super(message);
    }

}
