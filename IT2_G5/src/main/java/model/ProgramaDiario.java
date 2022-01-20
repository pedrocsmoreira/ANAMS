package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author grupo5
 */

public class ProgramaDiario {
    private int referencia;
    private Festival festival;
    private Recinto recinto;
    private Palco palco;
    private LocalDate dataFestival;
    private HashSet<Atuacao> atuacoes;

    private static int contador = 0;
    private final String STR_DEFAULT = "";
    private final int INT_DEFAULT = 0;

    public ProgramaDiario(){
        this.referencia = ++contador;
        this.festival = new Festival();
        this.recinto = new Recinto();
        this.palco = new Palco();
        this.dataFestival = LocalDate.now();
        this.atuacoes = new HashSet<>();
    }

    public ProgramaDiario(Festival festival, Recinto recinto, Palco palco, LocalDate dataFestival, HashSet<Atuacao> atuacoes){
        this.referencia = ++contador;
        this.festival = festival;
        this.recinto = recinto;
        this.palco = palco;
        this.dataFestival = dataFestival;
        this.atuacoes = atuacoes;
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public Palco getPalco() {
        return palco;
    }

    public void setPalco(Palco palco) {
        this.palco = palco;
    }

    public LocalDate getDataFestival() {
        return dataFestival;
    }

    public void setDataFestival(LocalDate dataFestival) {
        this.dataFestival = dataFestival;
    }

    public HashSet<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(HashSet<Atuacao> atuacoes) {
        this.atuacoes = atuacoes;
    }
}