package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC8Controller;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC8View {
    private Console console = System.console();
    private Clinica clinica;
    private UC8Controller controller;
    
    //Registar Cliente

    /**
     * Construtor
     * 
     * @param c
     */
    public UC8View(Clinica c){
        this.clinica = c;
        this.controller = new UC8Controller(clinica);
    }

    public void run(){
        String nome = console.readLine("Insira o nome do cliente: ");
        String endereco = console.readLine("Insira a morada do Cliente: ");
        int nif = Integer.parseInt(console.readLine("Insira o NIF do Cliente: "));
        Data dataNascimento = new Data();
        int contacto = Integer.parseInt(console.readLine("Insira o contacto do Cliente: "));
        String email = console.readLine("Insira o email do Cliente: ");
        Cliente cl = new Cliente(nome, endereco, nif, dataNascimento, contacto, email);
    }

}
