package controller;

import model.Festival;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class comprarBilhetesController {
    private GESTFEST gestfest;
    private Festival festival;
    private CompraBilhete compra;

    public comprarBilhetesController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public novaCompra(){
        this.compra = new CompraBilhete();
    }

    public void procurarFestival(String festival){
        festival = gestfest.procurarFestival(festival);
    }

    public void setTipoBilhete(int numTipo{
        HashSet<TipoBilhete> tipos = this.festival.getTipoBilhete();
        this.compra.setTipoBilhete();
    }

    public ArrayList<LocalDate> getDatas(){
        LocalDate dataInicio = festival.getDataInicio();
        LocalDate dataFim = festival.getDataFim();
        ArrayList<LocalDate> datas = new ArrayList<>();
        datas = 
        return datas;
    }
}