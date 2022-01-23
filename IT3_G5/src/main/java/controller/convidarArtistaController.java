package controller;

import exceptions.ExcecaoNaoExiste;
import java.util.Date;
import model.Artista;
import model.Convite;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class convidarArtistaController {
    private GESTFEST gestfest;
    private Convite convite;

    public convidarArtistaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void novoConvite(){
        this.convite = new Convite();
    }

    public Artista procurarArtista(String artista) throws ExcecaoNaoExiste {
        return gestfest.procurarArtista(artista);
    }

    public void setArtista(Artista artista) {
        convite.setArtista(artista);
        convite.setEmail(artista.getEmail());
    }

    public void setDataConvite(Date data) {
        convite.setDataConvite(data);
    }

    public void setDataLimite(Date data) {
        convite.setDataLimite(data);
    }

    public void setEstado(){
        convite.setEstado(0);
    }

    public String apresentarDados(){
        return convite.toString();
    }

    public boolean registarConvite(){
        if(gestfest.registaConvite(convite)){
            return true;
        }
        return false;
    }
}