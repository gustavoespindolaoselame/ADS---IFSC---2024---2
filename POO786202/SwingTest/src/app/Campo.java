package app;

import java.awt.*;
import javax.swing.*;

public class Campo {
    private int linhas = 11;
    private int colunas = 11;
    private int width = 500;
    private int height = 500;

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

    public static void CriarCampo(JPanel jcampo, Campo campo, JPanel[][] tabelacampo, Color cor){
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
                tabelacampo[i][j] = panel;
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
