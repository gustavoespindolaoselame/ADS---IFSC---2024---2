/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package questao3;

public class App {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        System.out.println(r1.toString());
        r1.setCodificacao("UTF8");
        System.out.println(r1.toString());
        r1.setAlt(16);
        r1.setLarg(48);
        System.out.println(r1.toString());
    }
}
