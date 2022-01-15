package controller;

import model.Convite;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class alterarEstadoController {
    private GESTFEST gestfest;
    private Convite convite;
    
    public alterarEstadoController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }
    
    public void procurarConvite(String festival, String artista){
        convite = new Convite(gestfest.procurarConvite());
    }
    
}