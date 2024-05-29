
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setSize(700, 700);
        frame.setBackground(Color.WHITE);

        BufferedImage spriteSheet = null;
        try {
            spriteSheet = ImageIO.read(new File("./gradle/app/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Campo campo = new Campo(5, 5, frame.getWidth(), frame.getHeight());
        int campoX = (frame.getWidth() - campo.getWidth()) / 2;
        int campoY = (frame.getHeight() - campo.getHeight()) / 2;

        JPanel fundo = new JPanel();

        JPanel jcampo = new JPanel(new GridLayout(campo.getLinhas(), campo.getColunas(), 0, 0));
        jcampo.setBackground(Color.WHITE);
        jcampo.setBounds(campoX, campoY, campo.getWidth(), campo.getHeight() - (frame.getHeight() / 9));
        JPanel[][] tabelacampo = new JPanel[campo.getLinhas()][campo.getColunas()];

        ArrayList<Peca> arPecas = new ArrayList<>();
        for (int i = 0; i < campo.getColunas(); i++) {
            arPecas.add(i, new Peca(0, spriteSheet, frame, campo));
            arPecas.get(i).setPosY(i);
            arPecas.get(i).setPosX(0);
        }
        for (int i = 0; i < campo.getColunas(); i++) {
            arPecas.add(i + campo.getColunas(), new Peca(1, spriteSheet, frame, campo));
            arPecas.get(i + campo.getColunas()).setPosY(i);
            arPecas.get(i + campo.getColunas()).setPosX(campo.getLinhas() - 1);
        }

        frame.getContentPane().add(fundo);
        Campo.CriarCampo(spriteSheet, jcampo, campo, tabelacampo, frame, arPecas);
        frame.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        arPecas.add(3, new Peca(1, spriteSheet, frame, campo));
        arPecas.get(3).setPosY(2);
        arPecas.get(3).setPosX(2);
        frame.getContentPane().add(fundo);
        jcampo.removeAll();
        Campo.CriarCampo(spriteSheet, jcampo, campo, tabelacampo, frame, arPecas);
        frame.setVisible(true);
    }
}
