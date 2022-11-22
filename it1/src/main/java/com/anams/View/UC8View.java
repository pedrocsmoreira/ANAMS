package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC8Controller;
import com.anams.Exception.ExceptionCliente.ExceptionClienteExiste;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC8View {
    private Console console = System.console();
    private Clinica clinica;
    private UC8Controller controller;
    
    //Registar Cliente

    public UC8View(Clinica c){
        this.clinica = c;
        this.controller = new UC8Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Registar Cliente ----------");
        novoCliente();
        inserirDados();
        apresentaDados();
        if(validaDados()){
            registarCliente();
        }else {
            System.out.println("Cliente não registado!!!");
        }
    }

    private void novoCliente(){ controller.novoCliente(); }

    private void inserirDados() {
        controller.setNome(getNome());
        controller.setEndereco(getEndereco());
        controller.setNif(getNif());
        controller.setDataNascimento(getDataNascimento());
        controller.setContacto(getContacto());
        controller.setEmail(getEmail());
    }

    private void apresentaDados() { System.out.println(controller.getCliente()); }

    private boolean validaDados() { return console.readLine("Pretende registar este cliente? (Y/N)").equals("Y")  ? true : false;  }

    private String getNome() { return console.readLine("Insira o nome do Cliente: "); }

    private String getEndereco(){ return console.readLine("Insira a morada do Cliente: ");}

    private int getNif(){ return Integer.parseInt(console.readLine("Insira NIF do Cliente: ")); }

    private Data getDataNascimento() {
        String strDataNascimento = console.readLine("Insira a data de nascimento (formato dia/mês/ano):");
        String str[] = strDataNascimento.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(year,month,day);
    }

    private int getContacto(){ return Integer.parseInt(console.readLine("Insira o contacto do Cliente: ")); }

    private String getEmail() { return console.readLine("Insira o email do médico:"); }

    private void registarCliente(){
        try{
            controller.registarCliente();
        }catch (ExceptionClienteExiste err){
            err.printStackTrace();
        }
    }
}

