package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author grupo5
 */

public class ProgramaFestival {
    private int referencia;
    private Festival festival;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private HashMap<LocalDate, ProgramaDiario> programaDiario;
    
    private static int contador = 0;
    
    public ProgramaFestival(){
        this.referencia = ++contador;
        this.festival = new Festival();
        this.dataInicio = LocalDate.now();
        this.dataFim = LocalDate.now();
        this.programaDiario = new HashMap<>();
    }

    public ProgramaFestival(Festival festival, LocalDate dataInicio, LocalDate dataFim, HashMap<LocalDate, ProgramaDiario> programaDiario){
        this.referencia = ++contador;
        this.festival = festival;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.programaDiario = programaDiario;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public HashMap<LocalDate, ProgramaDiario> getProgramaDiario() {
        return programaDiario;
    }

    public void setProgramaDiario(HashMap<LocalDate, ProgramaDiario> programaDiario) {
        this.programaDiario = programaDiario;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        ProgramaFestival.contador = contador;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + this.referencia + "\n");
        sb.append("Festival: " + this.festival + "\n");
        sb.append("Data de Início: " + this.dataInicio + "\n");
        sb.append("Data de Fim: " + this.dataFim + "\n");
        HashSet<ProgramaDiario> listapd = new HashSet<ProgramaDiario>(programaDiario.values());
        for(ProgramaDiario pd : listapd){
            sb.append(pd.getDataFestival());
            HashSet<Atuacao> listaAtuacao = pd.getAtuacoes();
            for(Atuacao a : listaAtuacao){
                sb.append(a.toString());
            }
        }
        return sb.toString();
    }

}