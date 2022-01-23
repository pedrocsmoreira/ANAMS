package exceptions;

/**
 *
 * @author grupo5
 */

public class ExcecaoProgramaNaoExiste extends Exception {
    public ExcecaoProgramaNaoExiste(){
        super();
    }
    
    public ExcecaoProgramaNaoExiste(String message){
        super(message);
    }
}