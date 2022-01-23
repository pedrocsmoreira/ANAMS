package ui;

import controller.alterarEstadoController;
import exceptions.ExcecaoNaoExiste;
import model.GESTFEST;
import utils.Utils;

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
        
        try{
            controller.procurarConvite(inserirFestival(), inserirArtista());
        }catch(ExcecaoNaoExiste e){
            e.printStackTrace();
        }
        
        apresentaEstados();
        
        controller.setEstado(inserirEstado());
        
        apresentaDados();
        
        if(Utils.confirma("Pretende alterar o Estado do Convite?")){
            controller.alteraEstado();
        }
    }

    private String inserirFestival(){
        return Utils.readLineFromConsole("Insira o festival a procurar");
    }

    private String inserirArtista(){
        return Utils.readLineFromConsole("Insira o artista a procurar");
    }

    private int inserirEstado(){
        return Utils.IntFromConsole("Insira o número do estado");
    }
    
    private void apresentaEstados(){
        System.out.println(controller.getListaEstados());
    }

    private void apresentaDados(){
        System.out.println(controller.getConvite());
    }   
}