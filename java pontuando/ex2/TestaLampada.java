package com.mycompany.lampada;

public class TestaLampada {

    public static void main(String[] args) {

        Lampada lamp = new Lampada();

        lamp.apagar();
        lamp.mostraEstado();

        lamp.acende();
        lamp.mostraEstado();

        lamp.apagar();
        lamp.mostraEstado();
    }
}
