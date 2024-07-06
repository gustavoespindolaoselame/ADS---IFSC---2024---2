package main.java.projetopratico;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<String> items;

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public void addItems(int newitems) {
        this.items.add(newitems, null);;
    }

    public Catalogo(ArrayList<String> items) {
        this.items = items;
    }

    public Catalogo(){
    }

    public void listarCatalogo(){
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
}
