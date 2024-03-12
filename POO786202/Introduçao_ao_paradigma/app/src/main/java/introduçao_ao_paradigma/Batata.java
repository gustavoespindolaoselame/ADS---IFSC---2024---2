package introduçao_ao_paradigma;

public class Batata {
    boolean capacete = false;
    boolean braco = false;
    int numasasabertas = 0;
    String[] falas = new String[6];
    public Batata(){
        falas[0] = "ao infinito e além";
        falas[1] = "sla 1";
        falas[2] = "oi";
        falas[3] = "aaaa";
        falas[4] = "bbbb";
        falas[5] = "ccccccccccccccc";
    }   
    public boolean retraircapacete(){
        if(capacete==true){
            capacete = false;
            System.out.println("capacete abaixado");
        } else {
            capacete = true;
            System.out.println("capacete retraído");
        }
        return capacete;
    }
    public void atirar(){
            System.out.println("pew pew pow");
    }

    public void falar(int vfala){
        System.out.println(falas[vfala-1]);
    }
}
