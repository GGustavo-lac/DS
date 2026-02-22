import javax.swing.JOptionPane;

public class Usuario {

    static void andar() {
        JOptionPane.showMessageDialog(null, "O usuário está andando.");
    }

    static void falar() {
        JOptionPane.showMessageDialog(null, "O usuário está falando.");
    }

    static void comer() {
        JOptionPane.showMessageDialog(null, "O usuário está comendo.");
    }

    static void beber() {
        JOptionPane.showMessageDialog(null, "O usuário está bebendo.");
    }

    public static void main(String[] args) {

        int idade;
        double salario;

        idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a idade:"));

        salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o salário:"));

        JOptionPane.showMessageDialog(null,
                "Idade: " + idade +
                "\nSalário: " + salario);

        andar();
        falar();
        comer();
        beber();
    }
}
