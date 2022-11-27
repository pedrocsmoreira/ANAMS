package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Controller.UC11Controller;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;
import com.anams.Exception.ExceptionSlot;

public class UC11View {
    private Console console = System.console();
    private Clinica clinica;
    private UC11Controller controller;

    private Cliente cliente;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC11View(Clinica clinica){
        this.clinica = clinica;
        this.controller = new UC11Controller(clinica);
    }

    public void run(Cliente cliente){
        this.cliente = cliente;
        System.out.println("---------- Efetuar Marcação ----------");
        novoSlot();
        inserirDados();
        controller.verSlot();
        String opcao = console.readLine("Pretende fazer esta marcação? (Y/N): ");
        if(opcao.equalsIgnoreCase("Y")){
            controller.guardarMarcacao();
        }
    }

    private void novoSlot(){
        controller.novoSlot(cliente);
    }

    private void inserirDados(){
        try{
            mostrarEspecialidades();
            int codigoEspecialidade = 0;
            do{
                codigoEspecialidade = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
            }while(codigoEspecialidade <= 0);
            procurarEspecialidade(codigoEspecialidade);
            procurarMedicos();
            int codigoMedico = 0;
            do{
                codigoMedico = Integer.parseInt(console.readLine("Insira o código do médico a marcar: "));
            }while(codigoMedico <= 0);
            procurarMedico(codigoMedico);
            procurarVagas();
            int codigoVaga = 0;
            do{
                codigoVaga = Integer.parseInt(console.readLine("Insira o código da vaga a preencher: "));
            }while(codigoVaga <= 0);
            escolherVaga(codigoVaga);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void mostrarEspecialidades() throws ExceptionEspecialidade{
        System.out.println(controller.verEspecialidades());
    }

    private void procurarEspecialidade(int codigo) throws ExceptionEspecialidade{
        this.controller.verificarEspecialidade(codigo);
    }

    private void procurarMedicos() throws ExceptionMedico{
        System.out.println(controller.procurarMedicos());
    }

    private void procurarMedico(int codigo) throws ExceptionMedico{
        this.controller.verificarMedico(codigo);
    }

    private void procurarVagas() throws ExceptionSlot{
        this.controller.procurarVagas();
    }

    private void escolherVaga(int codigoVaga) throws ExceptionSlot{
        this.controller.escolherVaga(codigoVaga);
    }

}
