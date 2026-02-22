
package com.mycompany.exemplo2;

import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {

        int t;
        String p;

        // O método digite() não foi utilizado neste exemplo,
        // pois a própria caixa de entrada já solicita a informação.
        // Dessa forma evitamos repetição desnecessária de mensagem.

        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");

        t = tamanho(p);

        JOptionPane.showMessageDialog(null,
                p + " possui " + t + " caracteres");
    }

    static int tamanho(String x) {
        return x.length();
    }
}
