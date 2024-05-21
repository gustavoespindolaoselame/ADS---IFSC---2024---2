import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        int campoWidth = 500;
        int campoHeight = 500;

        JFrame frame = new JFrame("Swing");
        frame.setSize(800, 800);

        JPanel fundo = new JPanel();
        fundo.setLayout(null);

        int campoX = (frame.getWidth() - campoWidth) / 2;
        int campoY = (frame.getHeight() - campoHeight) / 2;

        JPanel campo = new JPanel(new GridLayout(linhas, colunas, 1, 1));
        campo.setBackground(Color.WHITE);
        campo.setBounds(campoX, campoY, campoWidth, campoHeight-(frame.getHeight()/9));

        JPanel[][] novo = new JPanel[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                JPanel panel = new JPanel();
                panel.setBackground(Color.BLACK);
                campo.add(panel);
                novo[i][j] = panel;
            }
        }

        fundo.add(campo);
        frame.add(fundo);
        frame.setVisible(true);
    }
}
