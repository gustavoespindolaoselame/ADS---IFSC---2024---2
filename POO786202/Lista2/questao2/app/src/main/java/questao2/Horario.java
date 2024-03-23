package main.java.questao2;

public class Horario {
    private double segundo;
    private double minuto;
    private double hora;
    public Horario(){
    }

    public Horario(double h){
        if(h>24||h<0){
            this.segundo=0;
            this.minuto=0;
            this.hora=0;
        } else {
        this.hora=h;
        }
    }
    public Horario(double h, double m){
        if(h>24||h<0||m>60||m<0){
            this.segundo=0;
            this.minuto=0;
            this.hora=0;
        } else { 
        this.hora=h;
        this.minuto=m;
        }
    }
    public Horario(double h, double m, double s){
        if(h>24||h<0||m>60||m<0||s>60||s<0){
            this.segundo=0;
            this.minuto=0;
            this.hora=0;
        } else {
        this.hora=h;
        this.minuto=m;
        this.segundo=s;
        }
    }

    public void setSegundo(double segundo) {
        if (segundo>60||segundo<0){
            System.out.println("false");
        } else {
        this.segundo = segundo;
        }
    }

    public void setMinuto(double minuto) {
        if (min>60||min<0){
            System.out.println("false");
        } else { 
        this.minuto = minuto;
        }
    }

    public void setHora(double hora) {
        if (hora>60||hora<0){
            System.out.println("false");
        } else { 
        this.hora = hora;
        }
    }
    public String toString() {
        return hora + ":" + minuto + ":" + segundo + ":";
    }

    public String extenso(){
        String dechoraextenso;
        String horaextenso;
        String decminextenso;
        String minextenso;
        String decsecextenso;
        String secextenso;
        if(hora>=20){
            dechoraextenso="Vinte";
        }
    }
}
