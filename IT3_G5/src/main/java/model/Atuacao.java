package model;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author grupo5
 */

public class Atuacao {
    private int referencia;
    private Artista artista;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Duration duracao;
    
    private static int contador = 0;
    
    public Atuacao(){
        this.referencia = ++contador;
        this.artista = new Artista();
        this.dataHoraInicio = LocalDateTime.now();
        this.dataHoraFim = LocalDateTime.now();
        this.duracao = Duration.ofMinutes(0);
    }
    
    public Atuacao(Artista artista, LocalDateTime dataInicio, LocalDateTime dataFim){
        this.referencia = ++contador;
        this.artista = artista;
        this.dataHoraInicio = dataInicio;
        this.dataHoraFim = dataFim;
        this.duracao = Duration.between(dataInicio,dataFim);
    }

    public int getReferencia() {
        return referencia;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + referencia + "\n");
        sb.append("Artista: " + "\n" + artista.toString() + "\n");
        sb.append("Hora de início: " + dataHoraInicio.toString() + "\n");
        sb.append("Hora de Fim: " + dataHoraFim.toString() + "\n");
        sb.append("Duração: " + duracao + "\n");
        return sb.toString();
    }
    
}