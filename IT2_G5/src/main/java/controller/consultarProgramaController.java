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
    private ProgramaFestival programa;

    public consultarProgramaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void procurarPrograma(String festival) throws ExcecaoNaoExiste, ExcecaoProgramaNaoExiste{
        programa = gestfest.procuraFestivalPrograma(festival);
    }

    public String dadosPrograma(){
        return programa.toString();
    }
}