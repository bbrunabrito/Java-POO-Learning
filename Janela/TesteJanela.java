package Janela;
import javax.swing.*;

public class TesteJanela extends JFrame {
    public TesteJanela() {
        JLabel label = new JLabel("Olá, mundo!");

        add(label);

        setTitle("Minha Janela");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesteJanela();
    }
}
