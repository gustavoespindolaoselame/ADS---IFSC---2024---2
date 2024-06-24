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
    private BufferedImage subImage;
    private int backgroundcolor=1;

    public Peca(int posX, int posY, int textureid, BufferedImage spriteSheet, JFrame frame,
            Campo campo) {
        this();
        this.textureid = textureid;
        this.posX = posX;
        this.posY = posY;
        if((posX+(posY*campo.getColunas()))%2==0){
            this.backgroundcolor = 0;
        } else {
            this.backgroundcolor = 1;
        }
       this.subImage = spriteSheet.getSubimage(((this.textureid + backgroundcolor) % 4) * 16,
                (this.textureid / 4) * 16, 16, 16);
        this.sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                frame.getHeight() / campo.getLinhas(), Image.SCALE_DEFAULT);
        this.id = nextId++;
    }

    public void Render(Campo campo, BufferedImage spriteSheet, JFrame frame){
        if((posX+(posY*campo.getColunas()))%2==0){
            this.backgroundcolor = 0;
        }   else {
            this.backgroundcolor = 1;
        }
       this.subImage = spriteSheet.getSubimage(((this.textureid + backgroundcolor) % 4) * 16,
                (this.textureid / 4) * 16, 16, 16);
        this.sprite = subImage.getScaledInstance(frame.getWidth() / campo.getColunas(),
                frame.getHeight() / campo.getLinhas(), Image.SCALE_DEFAULT);
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

    public void setPosX(int posX, int tileset[][]) {
        tileset[this.posX][this.posY] = 0;
        this.posX = posX;
        tileset[posX][this.posY] = this.textureid;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY, int tileset[][]) {
        tileset[this.posX][this.posY] = 0;
        this.posY = posY;
        tileset[this.posX][posY] = this.textureid;
        
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
