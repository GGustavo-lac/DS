package com.mycompany.cilindro;

import javax.swing.JOptionPane;

public class ProgramaCilindro {

    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();

        double raio = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o raio do cilindro:")
        );

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a altura do cilindro:")
        );

        double area = cilindro.calcularAreaLateral(raio, altura);
        double volume = cilindro.calcularVolume(raio, altura);

        JOptionPane.showMessageDialog(
                null,
                "Área lateral: " + area +
                "\nVolume: " + volume
        );
    }
}
