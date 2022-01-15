package ui;

import controller.registarFestivalController;
import java.util.Date;
import java.util.HashSet;
import model.GESTFEST;
import model.Palco;
import model.Recinto;
import utils.Utils;

/**
 *
 * @author grupo5
 */ 

public class UC4_UI {
    private GESTFEST gestfest;
    private registarFestivalController controller;

    public UC4_UI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        this.controller = new registarFestivalController(gestfest);
    }

    public void run() {
        System.out.println("\nNovo Festival:");
        controller.novoFestival();

        controller.setDesignacao(introduzDesignacao());
        controller.setEdicao(introduzEdicao());
        controller.setLocalizacao(introduzLocalizacao());
        controller.setDataInicioFestival(introduzDataInicio());
        controller.setDataFimFestival(introduzDataFim());
        controller.setRecinto(introduzRecinto());

        apresentaDados();

        if(Utils.confirma("Confirma os dados do Festival? (S/N)")) {
            if(controller.registarFestival()) {
                System.out.println("Festival registado com sucesso!");
            }else {
                System.out.println("Festival não registado!");
            }
        }
    }

    private String introduzDesignacao() {
        String designacao = "";
        do{
           designacao = Utils.readLineFromConsole("Insira a designação do Festival"); 
        }while(designacao.isEmpty());
        return designacao;
    }

    private int introduzEdicao() {
        int edicao = 0;
        do{
            edicao = Utils.IntFromConsole("Insira a edição do Festival"); 
        }while(edicao == 0);
        return edicao;
    }

    private String introduzLocalizacao() {
        return Utils.readLineFromConsole("Insira a localização do Festival");
    }

    private Date introduzDataInicio() {
        Date dataInicio = new Date();
        do{
            dataInicio = Utils.readDateFromConsole("Insira a data de início do Festival");
        }while(dataInicio.equals(new Date()));
        return dataInicio;
    }

    private Date introduzDataFim() {
        Date dataFim = new Date();
        do{
            dataFim = Utils.readDateFromConsole("Insira a data de fim do Festival");
        }while(dataFim.equals(new Date()));
        return dataFim;
    }

    private Recinto introduzRecinto() {
        Recinto recinto = new Recinto();
        do{
            recinto.setDesignacao(Utils.readLineFromConsole("Insira a designação do Recinto"));
            HashSet<Palco> palcos = new HashSet<>();
            do{
                Palco p =  new Palco();
                p.setDesignacao(Utils.readLineFromConsole("Insira a designação do Palco"));
                p.setLotacao(Utils.IntFromConsole("Insira a lotação do Palco"));
                palcos.add(p);
            }while(Utils.confirma("Deseja inserir mais Palcos? (S/N)"));
        }while(recinto.equals(new Recinto()));
        return recinto;
    }

    private void apresentaDados() {
       
    }
}