package introduçao_ao_paradigma;

import java.util.Random;

public class Batata {
    boolean capacete = false;
    boolean braco = false;
    boolean asa = false;
    int numasasabertas = 0;
    String[] falas = new String[6];

    public Batata() {
        falas[0] = "Para o infinito e além!";
        falas[1] = "Buzz Lightyear ao resgate!";
        falas[2] = "Não sou um brinquedo, sou um patrulheiro espacial!";
        falas[3] = "Alguém precisa de ajuda no planeta Terra!";
        falas[4] = "Com licença, minha nave espacial precisa de um ajuste.";
        falas[5] = "Nunca duvidei que minha missão seria cumprida com sucesso.";
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

    public String retrairasa() {
        if (asa == true) {
        asa=false;
        return ("retraído");
        } else {
        asa=true;
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
