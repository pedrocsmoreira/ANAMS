package model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author grupo5
 */

public class Festival {
    private int referencia;
    private String designacao;
    private int edicao;
    private String localizacao;
    private Date dataInicioFestival;
    private Date dataFimFestival;
    private int numDias;
    private Recinto recinto;
    private int numpalcos;
    private int lotacaoPalcos;
    private HashSet<Entidade> entidades;
    private HashSet<Bilhete> bilhetes;
    private List<LocalDate> datas;

    private int contador = 0;
    private final String STR_DEFAULT = "";
    private final int INT_DEFAULT = 0;
    private final Date DATA_DEFAULT = new Date();

    public Festival(){
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.edicao = INT_DEFAULT;
        this.localizacao = STR_DEFAULT;
        this.dataInicioFestival = DATA_DEFAULT;
        this.dataFimFestival = DATA_DEFAULT;
        this.numDias = INT_DEFAULT;
        this.recinto = new Recinto();
        this.numpalcos = INT_DEFAULT;
        this.lotacaoPalcos = INT_DEFAULT;
        this.entidades = new HashSet<>();
        this.bilhetes = new HashSet<>();
    }

    public Festival(String designacao, int edicao, String localizacao, Date dataInicioFestival, Date dataFimFestival, Recinto recinto, HashSet<Entidade> entidades, HashSet<Bilhete> bilhetes){
        this.referencia = ++contador;
        this.designacao = designacao;
        this.edicao = edicao;
        this.localizacao = localizacao;
        this.dataInicioFestival = dataInicioFestival;
        this.dataFimFestival = dataFimFestival;
        this.numDias = (int) (dataFimFestival.getTime() - dataInicioFestival.getTime());
        this.recinto = recinto;
        this.numpalcos = numPalcos();
        this.lotacaoPalcos = lotacao();
        this.entidades = entidades;
        this.bilhetes = bilhetes;
        this.datas = datas(dataInicioFestival, dataFimFestival);
    }

    public Festival(Festival f){
        this.referencia = f.referencia;
        this.designacao = f.designacao;
        this.edicao = f.edicao;
        this.localizacao = f.localizacao;
        this.dataInicioFestival = f.dataInicioFestival;
        this.dataFimFestival = f.dataFimFestival;
        this.numDias = f.numDias;
        this.recinto = f.recinto;
        this.numpalcos = f.numpalcos;
        this.lotacaoPalcos = f.lotacaoPalcos;
        this.entidades = f.entidades;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getDataInicioFestival() {
        return dataInicioFestival;
    }

    public void setDataInicioFestival(Date dataInicioFestival) {
        this.dataInicioFestival = dataInicioFestival;
    }

    public Date getDataFimFestival() {
        return dataFimFestival;
    }

    public void setDataFimFestival(Date dataFimFestival) {
        this.dataFimFestival = dataFimFestival;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
        this.numpalcos = numPalcos();
        this.lotacaoPalcos = lotacao();
    }

    public int getNumpalcos() {
        return numpalcos;
    }

    public int getLotacaoPalcos() {
        return lotacaoPalcos;
    }

    public HashSet<Entidade> getEntidades() {
        return entidades;
    }

    public void setEntidades(HashSet<Entidade> entidades) {
        this.entidades = entidades;
    }
    
    public int lotacao(){
        int lotacao = 0;
        for(Palco p : recinto.getPalcos()){
            lotacao += p.getLotacao();
        }
        return lotacao;
    }
    
    public int numPalcos(){
        return recinto.getPalcos().size();
    }
    
    public List<LocalDate> datas(Date dataInicio, Date dataFim){
        LocalDate dataInicioLocal = convertToLocalDateViaMilisecond(dataInicio);
        LocalDate dataFimLocal = convertToLocalDateViaMilisecond(dataFim);
        long numOfDaysBetween = dataInicioLocal.until(dataFimLocal.plusDays(1), ChronoUnit.DAYS);
        List<LocalDate> datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> dataInicioLocal.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }

    public LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
          .atZone(ZoneId.systemDefault())
          .toLocalDate();
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + this.referencia + "\n");
        sb.append("Designação: " + this.designacao + "\n");
        sb.append("Edição: " + this.edicao + "\n");
        sb.append("Localização: " + this.localizacao + "\n");
        sb.append("dataInicioFestival: " + this.dataInicioFestival + "\n");
        sb.append("dataFimFestival: " + this.dataFimFestival + "\n");
        sb.append("Recinto: " + this.recinto.toString() + "\n");
        sb.append("Número de Palcos: " + this.numpalcos + "\n");
        return sb.toString();
    }

    //falta equals

    public List<TipoBilhete> getTipoBilhete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}