package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC11Controller;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

public class UC11View {
    private Console console = System.console();
    private Clinica clinica;
    private UC11Controller controller;

    //Efetuar Marcação

    /**
     * Construtor
     * 
     * @param c
     */
    public UC11View(Clinica c){
        this.clinica = c;
        this.controller = new UC11Controller(clinica);
    }

    public void run(Cliente cli){
        System.out.println("---------- Efetuar Marcação ----------");
        novaMarcacao();
        inserirDados();
    }

    private void novaMarcacao(){
        controller.novaMarcacao();
    }

    private void inserirDados(){
        inserirEspecialidade();
        inserirMedicos();
    }

    private void inserirEspecialidade(){
        if(!controller.verificarEspecialidade()){
            throw new ExceptionEspecialidadeNaoExiste("Não existem especialidades para poder marcar consulta!");
        }
        do{
            System.out.println(controller.verEspecialidades());
            int codigo = Integer.parseInt(console.readLine("Insira o número da especialidade a inserir"));
            controller.getEspecialidade(codigo);
        }while();
    }

    private void inserirMedicos(){
        if(!controller.verificarMedicos()){
            throw new ExceptionNaoExistemMedicos("Não existem médicos para poder marcar consulta!");
        }
        do{
            System.out.println(controller.verMedicos());
            int codigo = Integer.parseInt(console.readLine("Insira o número do médico a inserir"));
            controller.getMedico(codigo);

        }while();
    }

}
