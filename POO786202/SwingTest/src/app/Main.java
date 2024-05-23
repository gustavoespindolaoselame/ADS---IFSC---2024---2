import java.awt.*;
import javax.swing.*;

import app.Aba;
import app.Campo;

public class Main {

    public static void main(String[] args) {
        Campo campo = new Campo(11, 11, 500, 500);
        int campoX = (frame.getWidth() - campo.getWidth()) / 2;
        int campoY = (frame.getHeight() - campo.getHeight()) / 2;

        JFrame frame = new JFrame("Swing");
        frame.setSize(800, 800);
        frame.setBackground(Color.WHITE);

        JPanel fundo = new JPanel();
        fundo.setLayout(null);

        JPanel jcampo = new JPanel(new GridLayout(campo.getLinhas(), campo.getColunas(), 0, 0));
        jcampo.setBackground(Color.WHITE);
        jcampo.setBounds(campoX, campoY, campo.getWidth(), campo.getHeight()-(frame.getHeight()/9));
        JPanel[][] novo = new JPanel[campo.getLinhas()][campo.getColunas()];

        Color cor = new Color(0);

        CriarCampo(jcampo, campo, novo, cor);

        fundo.add(jcampo);
        frame.add(fundo);
        frame.setVisible(true);
    }

    public static void CriarCampo(JPanel jcampo, Campo campo, JPanel[][] novo, Color cor){
        for (int i = 0; i < campo.getLinhas(); i++) {
            for (int j = 0; j < campo.getColunas(); j++) {
                JPanel panel = new JPanel();
                if(cor==Color.BLACK){
                    cor=Color.WHITE;
                }
                else{
                    cor=Color.BLACK;
                }
                panel.setBackground(cor);
                jcampo.add(panel);
                novo[i][j] = panel;
            }
            if(campo.getColunas()%2==0){
            if(cor==Color.BLACK){
                cor=Color.WHITE;
            }
            else{
                cor=Color.BLACK;
            }
        }
        }
    }
}
