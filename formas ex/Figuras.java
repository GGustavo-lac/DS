package com.mycompany.figuras;

public class Figuras {

    public static void main(String[] args) {

        Circulo c = new Circulo();
        c.raio = 5;

        Quadrado q = new Quadrado();
        q.lado = 4;

        Retangulo r = new Retangulo();
        r.base = 6;
        r.altura = 3;

        System.out.println("Área do círculo: " + c.area());
        System.out.println("Área do quadrado: " + q.area());
        System.out.println("Área do retângulo: " + r.area());
    }
}
