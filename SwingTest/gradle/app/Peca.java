import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class Peca {
    private int posX = 0;
    private int posY = 0;
    private int textureid;
    private static int nextId = 0;
    private int id;
    private Image sprite;

    public Peca(int posX, int posY, int textureid, int tileset[][], BufferedImage spriteSheet, JFrame frame, Campo campo) {
        this();
        this.textureid = textureid;
        this.posX=posX;
        this.posY=posY;
        
        int backgroundcolor=0;
        
        if(tileset[posX][posY]==1){
            backgroundcolor++;
        } 
        BufferedImage subImage = spriteSheet.getSubimage(((this.textureid + backgroundcolor)% 4) * 16,(this.textureid / 4) * 16, 16, 16);
        tileset[posX][posY]=textureid;
        this.sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                frame.getHeight() / campo.getLinhas(), Image.SCALE_DEFAULT);
                this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int gettextureId() {
        return textureid;
    }

    public void settextureId(int id) {
        this.textureid = id;
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public Peca() {
    }

}
