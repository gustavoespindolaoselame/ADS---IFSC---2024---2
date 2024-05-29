
import java.awt.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Campo {
    private int linhas = 11;
    private int colunas = 11;
    private int width = 500;
    private int height = 500;

    public static void CriarCampo(BufferedImage spriteSheet, JPanel jcampo, Campo campo, JPanel[][] tabelacampo,
            JFrame frame,
            ArrayList<Peca> arPecas) {
        for (int i = 0; i < campo.getLinhas(); i++) {
            for (int j = 0; j < campo.getColunas(); j++) {
                boolean cont = true;
                for (int m = 0; m < arPecas.size(); m++) {
                    if (arPecas.get(m).getPosX() == i && arPecas.get(m).getPosY() == j) {
                        placePeca(jcampo, tabelacampo, i, j, m, frame, arPecas);
                        cont = false;
                    }
                }
                if (cont == true) {
                    placeTile(spriteSheet, jcampo, campo, tabelacampo, i, j, frame, arPecas);
                }
            }
        }
        frame.add(jcampo);
    }

    public static void placePeca(JPanel jcampo, JPanel[][] tabelacampo, int posx, int posy, int indid, JFrame frame,
            ArrayList<Peca> arPecas) {
        JPanel panel = new JPanel();
        ImageIcon icon = new ImageIcon(arPecas.get(indid).getSprite());
        JButton botao = new JButton(icon);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
        botao.setFocusPainted(false);
        botao.setMargin(new Insets(0, 0, 0, 0));
        botao.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        tabelacampo[posx][posy] = panel;
        jcampo.add(botao);
    }

    public static void placeTile(BufferedImage spriteSheet, JPanel jcampo, Campo campo, JPanel[][] tabelacampo,
            int posx, int posy, JFrame frame,
            ArrayList<Peca> arPecas) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        if ((posx + (posy * campo.getColunas())) % 2 == 0) {
            BufferedImage subImage = spriteSheet.getSubimage(0, 32, 16, 16);
            Image sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                    frame.getHeight() / campo.getLinhas(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(sprite);
            label.setIcon(icon);
            panel.add(label);
            tabelacampo[posx][posy] = panel;
            jcampo.add(panel);
        } else {
            BufferedImage subImage = spriteSheet.getSubimage(16, 32, 16, 16);
            Image sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                    frame.getHeight() / campo.getLinhas(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(sprite);
            label.setIcon(icon);
            panel.add(label);
            tabelacampo[posx][posy] = panel;
            jcampo.add(panel);
        }
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
