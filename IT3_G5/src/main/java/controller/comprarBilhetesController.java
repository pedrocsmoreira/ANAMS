package controller;

import exceptions.ExcecaoNaoExiste;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import model.Compra;
import model.GESTFEST;
import model.TipoBilhete;

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

    public void novaCompra(){
        this.compra = new Compra();
    }

    public void procuraFestival(String festival) throws ExcecaoNaoExiste{
        this.compra.getBilhete().setFestival(gestfest.procuraFestivalString(festival));
    }

    public void setTipoBilhete(int numTipo){
        this.compra.setTipoBilhete(this.compra.getBilhete().getFestival().getTipoBilhete());
    }

    public List<LocalDate> getDatas(){
        LocalDate startdate = convertToLocalDateViaMilisecond(this.compra.getBilhete().getFestival().getDataInicioFestival());
        LocalDate enddate =  convertToLocalDateViaMilisecond(this.compra.getBilhete().getFestival().getDataFimFestival());
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        List<LocalDate> datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }
    
    public LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
          .atZone(ZoneId.systemDefault())
          .toLocalDate();
    }

    public void verificaDescontos(){
        if(!verificaDescontoFamilia(this.compra.getBilhete().getQuantidade()).equals(0)){
            this.compra.setDesconto(verificaDescontoFamilia(this.compra.getBilhete().getQuantidade()));
        }else if(!verificaDescontoGrupo(this.compra.getBilhete().getQuantidade()).equals(0)){
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

    public ArrayList<TipoBilhete> getTipoBilhete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getBilhetesDisponiveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verificaDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumBilhetes(int introduzNumBilhetes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}