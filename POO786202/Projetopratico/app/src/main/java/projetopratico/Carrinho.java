package main.java.projetopratico;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> items;
    private double precofinal;

    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public double getPrecofinal() {
        return precofinal;
    }
    public void setPrecofinal(double precofinal) {
        this.precofinal = precofinal;
    }
    public Carrinho(ArrayList<Item> items, double precofinal) {
        this.items = items;
        this.precofinal = precofinal;
    }

    public Carrinho(){
    }
}
