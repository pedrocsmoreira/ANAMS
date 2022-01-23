package controller;

import exceptions.ExcecaoNaoExiste;
import model.Convite;
import model.Convite.Estado;
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
    
    public void procurarConvite(String festival, String artista) throws ExcecaoNaoExiste{
        convite = new Convite(gestfest.procurarConvite(festival, artista));
    }
    
    public Estado[] getListaEstados(){
        return convite.getListaEstados();
    }

    public void setEstado(int num){
        this.convite.setEstado(num);
    }

    public Convite getConvite(){
        return this.convite;
    }
    
    public void alteraEstado(){
        this.gestfest.alteraEstadoConvite(convite);
    }
}