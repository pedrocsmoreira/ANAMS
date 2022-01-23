package exceptions;

public class ExcecaoNaoExiste extends Exception{

    public ExcecaoNaoExiste(){
        super();
    }

    public ExcecaoNaoExiste(String message){
        super(message);
    }
}