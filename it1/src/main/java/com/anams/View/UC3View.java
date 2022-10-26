package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC3Controller;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Utils.Data;

public class UC3View {
    private Console console = System.console();
    private Clinica clinica;
    private UC3Controller controller;

    public UC3View(Clinica c){
        this.clinica = c;
        this.controller = new UC3Controller(c);
    }

    /**
     * 
     * 
     */
    public void run(){
        System.out.println("---------- Registar Médicos ----------");
        novoMedico();
        inserirDados();
        apresentaDados();
        if(validaDados()){
            registarMedico();
        }else {
            System.out.println("Médico não registado!!!");
        }
    }

    /**
     * 
     * 
     */
    private void novoMedico(){ controller.novoMedico(); }

    /**
     * 
     * 
     */
    private void inserirDados() {
        controller.setCodigo(getCodigo());
        controller.setNome(getNome());
        controller.setDataContratacao(getData());
        controller.setNif(getNif());
        controller.setCedula(getCedula());
        // o q fazer se getEspecialidades return null
        controller.setEspecialidades(getEspecialidades());
        controller.setEmail(getEmail());
        controller.setContacto(getContacto());
    }

    /**
     * 
     * 
     */
    private void apresentaDados() { System.out.println(controller.getMedico()); }

    /**
     * 
     * 
     * @return
     */
    private boolean validaDados() { return console.readLine("Pretende registar este médico? (Y/N)").equals("Y")  ? true : false;  }
    
    /**
     * 
     * 
     * @return
     */
    private int getCodigo() { return Integer.parseInt(console.readLine("Insira o código do médico:")); }

    /**
     * 
     * 
     * @return
     */
    private String getNome() { return console.readLine("Insira o nome do médico:"); }

    /**
     * 
     * 
     * @return
     */
    private Data getData() {
        String strData = console.readLine("Insira a data de contratação (formato dia/mês/ano):");
        String str[] = strData.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(year,month,day);
    }

    /**
     * 
     * 
     * @return
     */
    private int getNif(){ return Integer.parseInt(console.readLine("Insira NIF do médico")); }

    /**
     * 
     * 
     * @return
     */
    private int getCedula(){ return Integer.parseInt(console.readLine("Insira o número da cédula profissional:")); }

    /**
     * 
     * 
     * @return list
     */
    private ArrayList<Especialidade> getEspecialidades(){
        ArrayList<Especialidade> list = new ArrayList<Especialidade>();
        if(controller.verificarEspecialidades()){
            System.out.println("Não existem especialidades para atribuir!!!");
        }else{
            String opcao = "";
            do{
                System.out.println(controller.verEspecialidades());
                opcao = console.readLine("Insira o número da especialidade a inserir (ou 0 para sair)");
                if(opcao.equalsIgnoreCase("0")){
                    break;
                }else if(list.size() < 2){
                    list.add(controller.getEspecialidade(Integer.parseInt(opcao)));
                    break;
                }else {
                    System.out.println("Não pode inserir mais especialidades neste médico!!!!");
                    break;
                }
            }while(!opcao.equalsIgnoreCase("0"));
        }
        return list;
    }

    /**
     * 
     * 
     * @return email
     */
    private String getEmail() { return console.readLine("Insira o email do médico:"); }

    /**
     * 
     * 
     * @return contacto
     */
    private int getContacto() { return Integer.parseInt(console.readLine("Insira o contacto do médico:")); }

    /**
     * 
     */
    private void registarMedico(){
        try{
            controller.registarMedico();
        }catch (ExceptionMedicoExiste err){
            err.printStackTrace();
        }
    }

}
