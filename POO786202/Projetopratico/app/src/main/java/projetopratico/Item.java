package main.java.projetopratico;

public class Item {
    private double preco;
    private int quantidade;
    private String nome;
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Item(double preco, int quantidade, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }
}
