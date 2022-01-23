package ui;

import controller.comprarBilhetesController;
import exceptions.ExcecaoNaoExiste;
import java.util.ArrayList;
import model.GESTFEST;
import model.TipoBilhete;
import utils.Utils;

public class UC12_UI {
    private GESTFEST gestfest;
    private comprarBilhetesController controller;

    public UC12_UI(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() {
        System.out.println("Compra de Bilhetes");

        controller.novaCompra();

        try{
            controller.procuraFestival(introduzFestival());
        }catch(ExcecaoNaoExiste e){
            
        }

        ArrayList<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
        for (TipoBilhete tp : tipoBilhete) {
            System.out.println(tp);
        }

        controller.setTipoBilhete(introduzTipoBilhete(tipoBilhete.size()));

        controller.setNumBilhetes(introduzNumBilhetes(controller.getBilhetesDisponiveis()));

        controller.verificaDesconto();

        apresentaDados();

        if (Utils.confirma("Prentende inserir este plano? (S/N)")) {
            
        }
    }

    private String introduzFestival() {
        return Utils.readLineFromConsole("Insira o festival a trabalhar");
    }

    private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp) {
        int a = 0;
        do{
            a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getTipoBilhete());
        }while (a < 0 || a > lotacao);
        return new Integer(a);
    }

    private int introduzTipoBilhete(int num) {
        int a = 0;
        do{
            a = Utils.IntFromConsole("Insira o número do tipo de Bilhete que pretende aquirir");
        }while (a < 0 || a > num);
        return a;
    }

    private int introduzNumBilhetes(int numBilhetes) {
        System.out.println("Existem " + numBilhetes + " bilhetes disponíveis do tipo selecionado");
        int a = 0;
        if(Utils.confirma("Pretende aquirir bilhetes deste tipo?")) {
            do{
                a = Utils.IntFromConsole("Insira o número de bilhetes que pretende aquirir");
            }while (a < 0 || a > numBilhetes);
        }
        return a;
    }

    private void apresentaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}