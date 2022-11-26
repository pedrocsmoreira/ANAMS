package com.anams.Controller;

import com.anams.Exception.ExceptionCliente.ExceptionClienteExiste;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC8Controller {
    private Clinica clinica;
    private Cliente cliente;

    public UC8Controller(Clinica c){
        this.clinica = c;
    }

    public void novoCliente() { setCliente();}

    private void setCliente() { this.cliente = clinica.novoCliente(); }

    public void setNome(String nome) { this.cliente.setNome(nome); }

    public void setEndereco(String endereco) { this.cliente.setEndereco(endereco); }

    public void setNif(int nif) { this.cliente.setNif(nif); }

    public void setDataNascimento(Data dataNascimento) { this.cliente.setDataNascimento(dataNascimento); }

    public void setContacto(int contacto) { this.cliente.setContacto(contacto); }

    public void setEmail(String email) { this.cliente.setEmail(email); }

    public String getCliente() { return this.cliente.toString(); }

    public void registarCliente() throws ExceptionClienteExiste{ clinica.registarCliente(cliente); }

}
