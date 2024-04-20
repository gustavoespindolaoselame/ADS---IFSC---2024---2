package aula;

import java.util.ArrayList;

public class Autor {
    private String nacionalidade;
    private String nome;

    public Autor(String nacionalidade, String nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor [nacionalidade=" + nacionalidade + ", nome=" + nome + "]";
    }
    
    
}
