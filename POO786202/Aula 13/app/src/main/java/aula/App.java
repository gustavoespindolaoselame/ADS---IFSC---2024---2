/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aula;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        ArrayList<Livro> livraria = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();

        Autor gp1 = new Autor("Brasil", "Laranjinha");
        autores.add(gp1);
        Livro primeiro = new Livro("titulo", 29.90, autores, "13");
        livraria.add(primeiro);
        Livro segundo = new Livro("banana", 39.90, autores, "13");
        livraria.add(segundo);

        System.out.println(livraria.getFirst());
    }
}
