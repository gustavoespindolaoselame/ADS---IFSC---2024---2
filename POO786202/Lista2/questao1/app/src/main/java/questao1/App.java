/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package questao1;

import main.java.questao1.Ponto;

public class App {
    public static void main(String[] args) {
        Ponto a1 = new Ponto(1, 1);
        Ponto a2 = new Ponto(2,2);
        System.out.println(a1.dist(a2));
    }
}
