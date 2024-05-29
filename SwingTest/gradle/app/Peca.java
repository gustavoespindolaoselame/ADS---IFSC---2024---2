import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class Peca {
    private int posX = 4;
    private int posY = 4;
    private int id;
    private Image sprite;

    public Peca(int id, BufferedImage spriteSheet, JFrame frame, Campo campo) {
        this();
        this.id = id;
        BufferedImage subImage = spriteSheet.getSubimage((this.id % 4) * 16,(this.id / 4) * 16, 16, 16);
        this.sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                frame.getHeight() / campo.getLinhas(), Image.SCALE_DEFAULT);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
