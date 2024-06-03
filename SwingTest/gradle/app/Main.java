
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

        int[][] tileset = new int[campo.getLinhas()][campo.getColunas()];

        ArrayList<Peca> arPecas = new ArrayList<>();
        for (int i = 0; i < campo.getColunas(); i++) {
            for (int j = 0; j < campo.getLinhas(); j++) {
            if((i+(j*campo.getColunas()))%2==0){
            tileset[i][j]=0;
            } else {
                tileset[i][j]=1;   
            }
        }
    }
        for (int i = 0; i < campo.getColunas(); i++) {
            arPecas.add(i, new Peca(0,i,9, tileset, spriteSheet, frame, campo));
        }
        for (int i = 0; i < campo.getColunas(); i++) {
            arPecas.add(i + campo.getColunas(), new Peca(campo.getLinhas() - 1,i,10, tileset, spriteSheet, frame, campo));
        }

        frame.getContentPane().add(fundo);
        Campo.CriarCampo(tileset, spriteSheet, jcampo, campo, frame, arPecas);
        frame.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        arPecas.add(0, new Peca(2,2,10, tileset, spriteSheet, frame, campo));
        frame.getContentPane().add(fundo);
        jcampo.removeAll();
        Campo.CriarCampo(tileset, spriteSheet, jcampo, campo, frame, arPecas);
        frame.setVisible(true);
    }
}
