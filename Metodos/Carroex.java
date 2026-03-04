package com.mycompany.carroex;
class Carro {
    String cor;
    String modelo;
    String motor; 

    // Métodos definidos dentro da classe Carro
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
public class Carroex {
    public static void main(String[] args) {
        Carro umCarro = new Carro(); // Instanciando a classe Carro

        // Atribuindo os valores 
        umCarro.modelo = "Creta";
        umCarro.cor = "Cinza";
        umCarro.motor = "1.6";

        // Executando os métodos
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();

        // Limpando o objeto
        umCarro = null;
    }
}
