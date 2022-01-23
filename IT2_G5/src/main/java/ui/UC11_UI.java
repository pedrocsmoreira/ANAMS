package ui;

import controller.registarPlanoBilheticaController;
import exceptions.ExcecaoNaoExiste;
import java.time.LocalDate;
import java.util.List;
import model.GESTFEST;
import model.TipoBilhete;
import utils.Utils;

public class UC11_UI {

    private GESTFEST gestfest;
    private registarPlanoBilheticaController controller;

    public UC11_UI(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() {
        System.out.println("Planeamento da Bilhética de um festival");

        try {
            controller.consultarFestival(introduzFestival());
        } catch (ExcecaoNaoExiste e) {
            e.printStackTrace();
        }

        List<LocalDate> datas = controller.getDatas();
        List<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
        for (LocalDate d : datas) {
            controller.newPlanoDiario();
            for (TipoBilhete tp : tipoBilhete) {
                controller.setPlanoDiario(tp, introduzNumBilhetes(controller.getLotacao(), tp));
            }
            controller.setPlano(d);
        }

        apresentaDados();

        if (Utils.confirma("Prentende inserir este plano? (S/N)")) {
            if (controller.registarPlano()) {
                System.out.println("Plano de Bilhética inserido");
            } else {
                System.out.println("Plano não inserido");
            }
        }
    }

    private String introduzFestival() {
        return Utils.readLineFromConsole("Insira o festival a trabalhar");
    }

    private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp) {
        int a = 0;
        do {
            a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getTipoBilhete());
        } while (a < 0 || a > lotacao);
        return new Integer(a);
    }

    private void apresentaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}