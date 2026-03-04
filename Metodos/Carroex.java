package com.mycompany.carroex;

public class Carroex {

    public static void main(String[] args) {

        Carro umCarro = new Carro();

        umCarro.modelo = "Creta";
        umCarro.cor = "Cinza";
        umCarro.motor = "1.6";

        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();

        umCarro = null;
    }

}