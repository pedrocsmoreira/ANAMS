package controller;

import exceptions.ExcecaoNaoExiste;
import model.Festival;
import model.GESTFEST;
import model.PlanoBilheteira;

/**
 *
 * @author grupo5
 */

public class consultarBilheticaController {
    private GESTFEST gestfest;
    private Festival festival;
    private PlanoBilheteira plano;

    public consultarBilheticaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival) throws ExcecaoNaoExiste{
        this.festival = this.gestfest.procuraFestivalString(festival);
    }

    public PlanoBilheteira apresentaPlano(){
        return this.gestfest.procurarPlano(festival);
    }

    public boolean apresentaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}