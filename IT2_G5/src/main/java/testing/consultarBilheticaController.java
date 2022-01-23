package controller;

import model.Festival;
import model.GESTFEST;

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

    public void consultarFestival(String festival){
        this.festival = this.gestfest.procuraFestival(festival);
    }

    public PlanoBilheteira apresentaPlano(){
        return this.gestfest.procurarPlano(Festival festival);
    }
}