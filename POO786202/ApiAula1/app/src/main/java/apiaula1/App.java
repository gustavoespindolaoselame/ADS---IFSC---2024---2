/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package apiaula1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        String s = "Juca";

        nomes.add(s);
        nomes.add("Emerson");
        nomes.add("Gustavo");
        
        nomes.forEach(elemento->System.out.println("Nome:" + elemento));
    }
}
