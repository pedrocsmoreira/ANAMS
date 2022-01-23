package model;

import java.time.LocalDate;

/**
 *
 * @author grupo5
 */

public class Compra {
    private int referencia;
    private Bilhete bilhete;
    private float precoTotal;
    private LocalDate data;
    private int quantidade;
    private float desconto;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public Compra(){
        this.referencia = ++contador;
        this.bilhete = new Bilhete();
        this.precoTotal = INT_DEFAULT;
        this.quantidade  =  INT_DEFAULT;
        this.desconto = FLOAT_DEFAULT;
    }

    public Compra(Bilhete bilhete, float precoTotal, LocalDate data, int quantidade, float desconto){
        this.referencia = ++contador;
        this.bilhete = bilhete;
        this.precoTotal = precoTotal;
        this.data = LocalDate.now();
        this.quantidade  =  quantidade;
        this.desconto = desconto;
    }

    public Compra(Compra compra){
        this.referencia = compra.referencia;
        this.bilhete = compra.bilhete;
        this.precoTotal = compra.precoTotal;
        this.data = compra.data;
        this.quantidade  =  compra.quantidade;
        this.desconto = compra.desconto;
    }

    public int getReferencia() {
        return referencia;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}