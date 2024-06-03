
import java.awt.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Campo {
    private int linhas = 11;
    private int colunas = 11;
    private int width = 500;
    private int height = 500;

    public static void CriarCampo(int tileset[][], BufferedImage spriteSheet, JPanel jcampo, Campo campo,
            JFrame frame,
            ArrayList<Peca> arPecas) {
        for (int i = 0; i < campo.getColunas(); i++) {
            for (int j = 0; j < campo.getLinhas(); j++) {
                boolean cont = true;

                if (tileset[i][j] > 4) {
                    for (int m = 0; m < arPecas.size(); m++) {
                        if (arPecas.get(m).getPosX() == i && arPecas.get(m).getPosY() == j) {
                            if((i+(j*campo.getColunas()))%2!=0){
                                m++;
                            }
                            placePeca(jcampo, m, frame, arPecas);
                            cont = false;
                        }

                    }

                }
                if (cont == true) {
                    placeTile(spriteSheet, jcampo, campo, tileset[i][j], frame, arPecas);
                }
            }
        }
        frame.add(jcampo);
    }

    public static void placePeca(JPanel jcampo, int indid, JFrame frame,
            ArrayList<Peca> arPecas) {
        ImageIcon icon = new ImageIcon(arPecas.get(indid).getSprite());
        JButton botao = new JButton(icon);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setFocusPainted(false);
        botao.setMargin(new Insets(0, 0, 0, 0));
        botao.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        jcampo.add(botao);
    }

    public static void placeTile(BufferedImage spriteSheet, JPanel jcampo, Campo campo,
            int indid, JFrame frame,
            ArrayList<Peca> arPecas) {

        BufferedImage subImage = spriteSheet.getSubimage(indid * 16, 0, 16, 16);
        Image sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                frame.getHeight() / campo.getLinhas(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(sprite);
        JButton botao = new JButton(icon);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setFocusPainted(false);
        botao.setMargin(new Insets(0, 0, 0, 0));
        botao.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        jcampo.add(botao);

    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Campo(int linhas, int colunas, int width, int height) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.width = width;
        this.height = height;
    }
}
