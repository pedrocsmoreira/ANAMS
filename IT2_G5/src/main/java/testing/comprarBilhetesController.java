package controller;

import model.Festival;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class comprarBilhetesController {
    private GESTFEST gestfest;
    private Compra compra;

    public comprarBilhetesController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public novaCompra(){
        this.compra = new CompraBilhete();
    }

    public void procurarFestival(String festival){
        this.compra.setFestival(gestfest.procurarFestival(festival));
    }

    public void setTipoBilhete(int numTipo{
        this.compra.setTipoBilhete(this.festival.getTipoBilhete());
    }

    public ArrayList<LocalDate> getDatas(){
        LocalDate startdate = this.compra.festival.getDataInicio();
        LocalDate enddate =  this.compra.festival.getDataFim();
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }

    public void verificaDescontos(){
        if(!verificaDescontoFamilia(this.bilhete.getNumBilhetes()).equals(0)){
            this.compra.setDesconto(verificaDescontoFamilia(this.bilhete.getNumBilhetes()));
        }else if(!verificaDescontoGrupo(this.bilhete.getNumBilhetes()).equals(0)){
            this.compra.setDesconto(verificaDescontoGrupo(this.bilhete.getNumBilhetes()));
        }else {
            this.compra.setDesconto(0);
        }
    }

    public float verificaDescontoFamilia(int numBilhetes){
        return DescontoFamilia.obterDesconto(numBilhetes);
    }

    public float verificaDescontoGrupo(int numBilhetes){
        return DescontoGrupo.obterDesconto(numBilhetes);
    }
}