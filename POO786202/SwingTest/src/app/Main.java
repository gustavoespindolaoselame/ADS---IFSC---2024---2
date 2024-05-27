import app.Campo;

import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import app.Aba;
import app.Campo;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing");
        frame.setSize(800, 800);
        frame.setBackground(Color.WHITE);

        BufferedImage spriteSheet = null;
        try {
            spriteSheet = ImageIO.read(new File("/home/maglab/SwingTest/src/app/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int spriteX = 0;
        int spriteY = 0;
        int spriteWidth = 16;
        int spriteHeight = 16;
        BufferedImage sprite = spriteSheet.getSubimage(spriteX, spriteY, spriteWidth, spriteHeight);

        Campo campo = new Campo(11, 11, 500, 500);
        int campoX = (frame.getWidth() - campo.getWidth()) / 2;
        int campoY = (frame.getHeight() - campo.getHeight()) / 2;

        JPanel fundo = new JPanel();
        fundo.setLayout(null);

        JPanel jcampo = new JPanel(new GridLayout(campo.getLinhas(), campo.getColunas(), 0, 0));
        jcampo.setBackground(Color.WHITE);
        jcampo.setBounds(campoX, campoY, campo.getWidth(), campo.getHeight() - (frame.getHeight() / 9));
        JPanel[][] tabelacampo = new JPanel[campo.getLinhas()][campo.getColunas()];

        Color cor = new Color(0);

        Campo.CriarCampo(jcampo, campo, tabelacampo, cor);

        ImageIcon icon = new ImageIcon(sprite);
        JLabel label = new JLabel(icon);

        jcampo.add(label);
        fundo.add(jcampo);
        frame.getContentPane().add(fundo);
        frame.setVisible(true);
    }
}
