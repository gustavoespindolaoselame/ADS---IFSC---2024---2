package lab;

public class Caneta {

    //Atributos
    private int nivelTinta;
    private final String cor;

    public Caneta(int nivelTinta, String cor){
        this.nivelTinta = nivelTinta;
        this.cor = cor;
    }

    public Caneta(String cor) {
        this(100,cor);
    }

    public Caneta() {
        this (100, "vermelha");
    }
    public int getNivelTinta() {
        return nivelTinta;
    }
    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
    public String getCor() {
        return cor;
    }
}
