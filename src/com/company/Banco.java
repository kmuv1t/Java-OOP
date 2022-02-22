package com.company;

public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Carlos Borges");
        Conta conta2 = new Conta();

        System.out.println(conta1.getTitular());
        System.out.println(conta1.getJuros());

        System.out.println(conta2.getTitular());
        System.out.println(conta2.getJuros());
    }
}
