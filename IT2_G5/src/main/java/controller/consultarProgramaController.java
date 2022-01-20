package controller;

import exceptions.ExcecaoNaoExiste;
import exceptions.ExcecaoProgramaNaoExiste;
import model.Festival;
import model.GESTFEST;
import model.ProgramaFestival;

/**
 *
 * @author grupo5
 */

public class consultarProgramaController {
    private GESTFEST gestfest;
    private Festival festival;
    private ProgramaFestival programa;
    
    public consultarProgramaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }
    
    public void procurarFestival(String festival) throws ExcecaoNaoExiste, ExcecaoProgramaNaoExiste{
        gestfest.procuraFestivalPrograma(festival);
    }
    
    public void procurarPrograma() throws ExcecaoProgramaNaoExiste{
        programa = gestfest.procuraPrograma(festival);
    }
    
    public String dadosPrograma(){
        return programa.toString();
    }
}