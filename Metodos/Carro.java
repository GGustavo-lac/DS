package com.mycompany.carroex;

public class Carro {
    String cor;
    String modelo;
    String motor;

    void ligar() {
        System.out.println("Ligando o " + modelo);
    }

    void desligar() {
        System.out.println("Desligando o " + modelo);
    }

    void acelerar() {
        System.out.println("Acelerando o " + modelo);
    }

    void brecar() {
        System.out.println("Brecando o " + modelo);
    }

    void mudarMarcha() {
        System.out.println("Marcha engatada no " + modelo);
    }
}