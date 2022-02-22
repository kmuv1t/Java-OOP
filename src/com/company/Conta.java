package com.company;

public class Conta {

    // Construtor padrão

    private String titular; // Atributo da Classe
    private int numero;
    private double saldo;
    private double juros;

    public Conta(String titular) { // Sobrecarga de método
        this.titular = titular;
        this.juros = 1;
    }

    public Conta() {
        this.juros = 1;
    }

    public void setJuros(double juros) {
        if (juros >= 0) {
            this.juros = juros;
        }
    }

    public double getJuros() {
        return juros;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

}
