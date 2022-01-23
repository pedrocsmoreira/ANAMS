package ui;

import controller.convidarArtistaController;
import exceptions.ExcecaoBreak;
import exceptions.ExcecaoNaoExiste;
import java.io.IOException;
import java.util.Date;
import model.Artista;
import model.Estado;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC07_UI {
    private GESTFEST gestfest;
    private convidarArtistaController controller;

    public UC07_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    
    public void run() throws IOException{
        System.out.println("");

        controller.novoConvite();
        
        try{
            controller.setArtista(inserirArtista());
        }catch(ExcecaoBreak e){
            //
        }        
        controller.setDataConvite(new Date());
        controller.setDataLimite(inserirDataLimite());
        controller.setEstado();
        
        apresentarDados();
        
        if(Utils.confirma("Pretene realizar este convite? (S/N)")){
            if(controller.registarConvite()){
                System.out.println("Convite registado");
            }else{
                System.out.println("Convite não registado");
            }
        }
    
    }

    private Artista inserirArtista() throws ExcecaoBreak{
        String art = Utils.readLineFromConsole("Insira o nome do artista a convidar");
        try{
            return controller.procurarArtista(art);
        }catch (ExcecaoNaoExiste e){
            controller.setArtista(new Artista());
            throw new ExcecaoBreak(e.getMessage());
        }
    }
    
    private Date inserirDataLimite(){
        return Utils.readDateFromConsole("Insira a data limite do convite");
    }
    
    private void apresentarDados(){
        System.out.println(controller.apresentarDados());
    }
}