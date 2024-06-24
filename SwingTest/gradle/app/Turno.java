import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Turno {
    private Peca peca;
    private int turn = 0;

    public Turno(Campo campo, ArrayList<Peca> arPecas, int[][] tileset, BufferedImage spriteSheet, JPanel jcampo,
            JPanel fundo, JFrame frame) {
        while (true) {
            this.peca = campo.peca;
            switch (turn) {
                default:
                    if (campo.click1 != false) {
                        if (campo.click2 != false) {
                            if (campo.click2x < peca.getPosX() + 1.1 &&
                                    campo.click2y < peca.getPosY() + 1.1 &&
                                    campo.click2x > peca.getPosX() - 1.1 &&
                                    campo.click2y > peca.getPosY() - 1.1) {
                                peca.setPosX(campo.click2x, tileset);
                                peca.setPosY(campo.click2y, tileset);
                            }
                            if(campo.click2x-peca.getPosX()==2&&campo.click2y-peca.getPosY()==2){
                                if (tileset[peca.getPosX() + 1][peca.getPosY() + 1] == 8) {
                                    tileset[peca.getPosX() + 1][peca.getPosY() + 1] = 0;
                                    peca.setPosX(campo.click2x, tileset);
                                    peca.setPosY(campo.click2y, tileset);
                                }
                            }
                            if(peca.getPosX()-campo.click2x==2&&peca.getPosY()-campo.click2y==2){
                                if (tileset[peca.getPosX() - 1][peca.getPosY() - 1] == 8) {
                                    tileset[peca.getPosX() - 1][peca.getPosY() - 1] = 0;
                                    peca.setPosX(campo.click2x, tileset);
                                    peca.setPosY(campo.click2y, tileset);
                                }
                            }
                            if(peca.getPosX()-campo.click2x==2&&campo.click2y-peca.getPosY()==2){
                                if (tileset[peca.getPosX() - 1][peca.getPosY() + 1] == 8) {
                                    tileset[peca.getPosX() - 1][peca.getPosY() + 1] = 0;
                                    peca.setPosX(campo.click2x, tileset);
                                    peca.setPosY(campo.click2y, tileset);
                                }
                            }
                            if(campo.click2x-peca.getPosX()==2&&peca.getPosY()-campo.click2y==2){
                                if (tileset[peca.getPosX() + 1][peca.getPosY() - 1] == 8) {
                                    tileset[peca.getPosX() + 1][peca.getPosY() - 1] = 0;
                                    peca.setPosX(campo.click2x, tileset);
                                    peca.setPosY(campo.click2y, tileset);
                                }
                            }
                            jcampo.removeAll();
                            peca.Render(campo, spriteSheet, frame);
                            Campo.CriarCampo(tileset, spriteSheet, jcampo, campo, frame, arPecas);
                            frame.setVisible(true);
                            campo.click1 = false;
                            campo.click2 = false;
                        }
                    }
                    break;
                case 1:
                    if (campo.click2 != false) {
                        if (campo.click1 != false) {
                        }
                    }
                    break;
            }
        }
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

}