package com.anams.Model;

import java.util.ArrayList;
import com.anams.Extra.Data;

public class Medico {
    private int codigo;
    private String nome;
    private Data dataContratacao;
    private int nif;
    private int cedula;
    private ArrayList<Especialidade> especialidades;
    private String email;
    private int contacto;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
}
