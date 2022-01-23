package exceptions;

/**
 *
 * @author grupo5
 */

public class ExcecaoProgramaExiste extends Exception{
    public ExcecaoProgramaExiste(){
        super();
    }

    public ExcecaoProgramaExiste(String message){
        super(message);
    }
}