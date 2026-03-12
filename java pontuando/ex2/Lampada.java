package com.mycompany.lampada;

public class Lampada {

    String estadoDaLampada;

    void acende() {
        estadoDaLampada = "acesa";
    }

    void apagar() {
        estadoDaLampada = "apagada";
    }

    void mostraEstado() {
        System.out.println("A lâmpada está " + estadoDaLampada);
    }
}
