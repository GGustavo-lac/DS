package com.mycompany.exercicio2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        double base, altura, h;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));

        Hipotenusa calc = new Hipotenusa();
        h = calc.hipotenusa(base, altura);

        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + h);
    }
}