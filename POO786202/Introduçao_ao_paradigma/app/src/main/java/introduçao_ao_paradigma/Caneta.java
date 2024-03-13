package introduçao_ao_paradigma;

public class Caneta {
    int tintanum;
    String tintacor;

    
    public int getTintanum() {
        return tintanum;
    }


    public void setTintanum(int tintanum) {
        this.tintanum = tintanum;
    }


    public String getTintacor() {
        return tintacor;
    }


    public void setTintacor(String tintacor) {
        this.tintacor = tintacor;
    }


    public String desenhar() {
        tintanum--;
        return "Desenhando, cor"+tintacor+"número"+tintanum;
    }
}
