
import javax.swing.JOptionPane;

public class Exemplo2 {

    static void digite() {
        JOptionPane.showMessageDialog(null, "Digite uma palavra:");
    }

    static int tamanho(String x) {
        return x.length();
    }

    public static void main(String[] args) {

        String p;
        int t;

        digite();
        p = JOptionPane.showInputDialog("");
        t = tamanho(p);

        JOptionPane.showMessageDialog(null,
                "Quantidade de caracteres: " + t);
    }
}

