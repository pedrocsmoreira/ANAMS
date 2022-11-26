package com.anams.Exception.ExceptionCliente;

public class ExceptionClienteNaoExiste extends Exception{
    public ExceptionClienteNaoExiste(){
        super();
    }

    public ExceptionClienteNaoExiste(String message){
        super(message);
    }

}
