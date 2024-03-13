package introduçao_ao_paradigma;

import java.util.Random;

public class Batata {
    boolean capacete = false;
    boolean braco = false;
    int numasasabertas = 0;
    String[] falas = new String[6];

    public Batata() {
        falas[0] = "ao infinito e além";
        falas[1] = "sla 1";
        falas[2] = "oi";
        falas[3] = "aaaa";
        falas[4] = "bbbb";
        falas[5] = "ccccccccccccccc";
    }

    public String retraircapacete() {
        if (capacete == true) {
        capacete=false;
        return ("retraído");
        } else {
        capacete=true;
        return ("aberto");
        }
    }

    public String atirar() {
        return ("pew pew pew pow pow pow");
    }

    public String falar(int i) {
        return falas[i];
    }

    public String golpeando() {
        return ("golpeando");
    }
}
