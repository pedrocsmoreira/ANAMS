package ui;

import controller.alterarEstadoController;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class UC08_UI {
    private GESTFEST gestfest;
    private alterarEstadoController controller;
    
    public UC08_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        this.controller = new alterarEstadoController(gestfest);
    }
    
    public void run(){
        System.out.println("Alterar estado do convite");
        
        controller.setEstado(inserirEstado());
        
    }
}