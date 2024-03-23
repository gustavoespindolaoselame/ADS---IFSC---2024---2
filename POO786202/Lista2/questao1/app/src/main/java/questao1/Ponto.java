package main.java.questao1;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double xconstr, double yconstr) {
        this.x=xconstr;
        this.y=yconstr;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "Ponto (x=" + x + ", y=" + y + ")";
    }
    
    public double dist(Ponto a1){
        return Math.sqrt(Math.pow(this.x-a1.x, 2)+Math.pow(this.y-a1.y, 2));
    }
}
