package com.mycompany.cilindro;

public class Cilindro {

    double calcularAreaLateral(double raio, double altura) {
        return 2 * Math.PI * raio * altura;
    }

    double calcularVolume(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }
}
