package ui;

import controller.criarProgramaController;
import exceptions.ExcecaoNaoExiste;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import model.Atuacao;
import model.GESTFEST;
import model.Palco;
import model.ProgramaDiario;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC09_UI {
    private GESTFEST gestfest;
    private criarProgramaController controller;

    public UC09_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        this.controller = new criarProgramaController(gestfest);
    }

    public void run(){
        System.out.println("Criar Programa de Festival");

        controller.procurarFestival(inserirFestival());

        List<LocalDate> datas = controller.getDatas();
        for(LocalDate ld : datas){
            controller.programaDiario(ld, inserirProgramaDiario(ld));
        }
        
        apresentarDados();
        
        if(Utils.confirma("Pretende inserir esta programação do festival? (S/N)")){
            if(controller.inserirPrograma()){
                System.out.println("Programa de Festival inserido");
            }else{
                System.out.println("Programa de Festival não inserido");
            }
        }
    }

    private String inserirFestival(){
        return Utils.readLineFromConsole("Insira o nome do festival para o qual deseja criar um programa");
    }

    private ProgramaDiario inserirProgramaDiario(LocalDate ld){
        ProgramaDiario pd = new ProgramaDiario();
        pd.setFestival(controller.getFestival());
        pd.setRecinto(controller.getRecinto());
        pd.setPalco(inserirPalco());
        pd.setDataFestival(ld);
        pd.setAtuacoes(inserirAtuacoes(ld));
        return pd;
    }

    private Palco inserirPalco(){
        ArrayList<Palco> palcos = new ArrayList<Palco>(controller.getPalcos());
        for(Palco p : palcos){
            System.out.println(p.toString());
        }
        String opcao = Utils.readLineFromConsole("Escolha um palco a trabalhar");
        int op = Integer.parseInt(opcao);
        return palcos.get(op);
    }

    private HashSet<Atuacao> inserirAtuacoes(LocalDate ld){
        HashSet<Atuacao> atuacoes = new HashSet<>();
        do{
            atuacoes.add(adicionaAtuacoes(ld));
        }while(Utils.confirma("Pretende inserir mais atuacoes nesta data?? (S/N)"));
        return atuacoes;
    }

    private Atuacao adicionaAtuacoes(LocalDate ld){
        Atuacao atuacao = new Atuacao();
        try{
            atuacao.setArtista(controller.procurarArtista(inserirArtista()));
        }catch(ExcecaoNaoExiste e){
            e.printStackTrace();
        }
        atuacao.setDataHoraInicio(inserirHoraInicio(ld));
        atuacao.setDataHoraFim(inserirHoraFim(ld));
        return atuacao;
    }
    
    public String inserirArtista(){
        return Utils.readLineFromConsole("Insira o nome do artista");
    }
    
    public LocalDateTime inserirHoraInicio(LocalDate ld){
        int hora = 0;
        int minutos = 0;
        do{
            hora = Utils.IntFromConsole("Insira a hora de começo da atuação");
        }while(hora == 0 && hora > 24);
        do{
            minutos = Utils.IntFromConsole("Insira os minutos de começo da atuação");
        }while(hora == 0 && hora >= 60);
        LocalTime lt = LocalTime.of(hora,minutos);
        LocalDateTime inicio = LocalDateTime.of(ld,lt);
        return inicio;
    }
    
    public LocalDateTime inserirHoraFim(LocalDate ld){
        int hora = 0;
        int minutos = 0;
        do{
            hora = Utils.IntFromConsole("Insira a hora de fim da atuação");
        }while(hora == 0 && hora > 24);
        do{
            minutos = Utils.IntFromConsole("Insira os minutos de fim da atuação");
        }while(hora == 0 && hora >= 60);
        LocalTime lt = LocalTime.of(hora,minutos);
        LocalDateTime fim = LocalDateTime.of(ld,lt);
        return fim;
    }
    
    public void apresentarDados(){
        System.out.println(controller.dadosPrograma());
    }
}