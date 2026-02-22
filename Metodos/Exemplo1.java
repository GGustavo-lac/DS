import javax.swing.JOptionPane;

public class Exemplo1 {

    static void dobro(int n) {
        int resultado = n * 2;
        JOptionPane.showMessageDialog(null,
                "Dobro: " + resultado);
    }

    public static void main(String[] args) {

        int a;

        // Caixa de diálogo removida aqui

        a = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número:"));

        dobro(a);
    }
}
