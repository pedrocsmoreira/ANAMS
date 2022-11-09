package com.anams.Model;

import com.anams.Utils.Data;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private int nif;
    private Data dataNascimento;
    private int contacto;
    private String email;

    private static int contador = 0;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Cliente(){

    }

    public Cliente(String nome, String endereco, int nif, Data dataNascimento, int contacto, String email){

    }



}
