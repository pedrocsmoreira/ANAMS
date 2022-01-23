package controller;

import exceptions.ExcecaoNaoExiste;
import exceptions.ExcecaoProgramaExiste;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import model.Artista;
import model.Atuacao;
import model.Festival;
import model.GESTFEST;
import model.Palco;
import model.ProgramaDiario;
import model.ProgramaFestival;
import model.Recinto;

/**
 *
 * @author grupo5
 */

public class criarProgramaController {
    private GESTFEST gestfest;
    private ProgramaFestival programaFestival;
    private List<LocalDate> datas;
    
    public criarProgramaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }
    
    public void procurarFestival(String festival){
        try{
            Festival fest = gestfest.procuraFestivalSemPrograma(festival);
            programaFestival.setFestival(fest);
            Date dataInicio = fest.getDataInicioFestival();
            LocalDate localDataInicio = Instant.ofEpochMilli(dataInicio.getTime())
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
            programaFestival.setDataInicio(localDataInicio);
            Date dataFim = fest.getDataInicioFestival();
            LocalDate localDataFim = Instant.ofEpochMilli(dataFim.getTime())
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
            programaFestival.setDataFim(localDataFim);
            datas = localDataInicio.datesUntil(localDataFim)
                            .collect(Collectors.toList());
        }catch(ExcecaoNaoExiste e){
           e.printStackTrace();
        }catch(ExcecaoProgramaExiste e){
           e.printStackTrace();
        }
    }
    
    public Festival getFestival(){
        return programaFestival.getFestival();
    }

    public List<LocalDate> getDatas(){
        return datas;
    }
    
    public Recinto getRecinto(){
        return programaFestival.getFestival().getRecinto();
    }
    
    public HashSet<Palco> getPalcos(){
        return programaFestival.getFestival().getRecinto().getPalcos();
    }
    
    public Artista procurarArtista(String artista) throws ExcecaoNaoExiste{
        return gestfest.procurarArtista(artista);
    }

    public void programaDiario(LocalDate ld, ProgramaDiario pd){
        HashMap<LocalDate, ProgramaDiario> programa = programaFestival.getProgramaDiario();
        programa.put(ld, pd);
        programaFestival.setProgramaDiario(programa);
    }
    
    public String dadosPrograma(){
        return programaFestival.toString();
    }
    
    public boolean inserirPrograma(){
        return gestfest.inserirPrograma(programaFestival);
    }
}