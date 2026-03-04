package com.mycompany.exemplo3;

import javax.swing.JOptionPane;

public class Exemplo3 {

    public static void main(String[] args) {
        double base, altura, h;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

        h = hipotenusa(base, altura);

        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + h);
    }

    static double hipotenusa(double b, double a) {
        return Math.sqrt((b * b) + (a * a));
    }
}