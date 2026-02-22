package com.mycompany.exemplo1;

import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) {

        int a;

        digite(); // chamada do método 

        a = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número"));

        dobro(a);
    }

    static void digite() {
        // a caixa de diálogo que estava aqui foi removida
        // conforme solicitado (para não pedir o número duas vezes).
        // O método foi mantido para preservar a estrutura do exemplo.
    }

    static void dobro(int n) {
        int d = n * 2;

        JOptionPane.showMessageDialog(null,
                "Dobro de " + n + " é " + d);
    }
}
