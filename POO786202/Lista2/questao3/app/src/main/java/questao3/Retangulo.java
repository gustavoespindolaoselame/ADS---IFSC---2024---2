package questao3;

public class Retangulo {
    private double larg;
    private double alt;
    private String codificacao;

    public Retangulo(double largura, double altura, String octa) {
        if (largura <= 0 || altura <= 0) {
            this.larg = 4;
            this.alt = 3;
        }
        if (octa != "ASCII" || octa != "UTF8") {
            this.codificacao = "ASCII";
        }
    }

    public Retangulo() {
        this.larg = 4;
        this.alt = 3;
        this.codificacao = "ASCII";
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public void setCodificacao(String codificacao) {
        this.codificacao = codificacao;
    }

    public double getArea() {
        return this.alt * this.larg;
    }

    public double getPerimetro() {
        return (2 * this.alt) + (2 * this.larg);
    }

    public String toString() {
        String stringer = "";
        if (this.codificacao.equals("ASCII")) {
            for (double i = 0; i < this.alt; i++) {    
                for (double j = 0; j < this.larg; j++) {
                    if(j==0&&i==0||j==0&&i==this.alt-1||j==this.larg-1&&i==this.alt-1||j==this.larg-1&&i==0){
                        stringer=stringer.concat("+"); 
                    }else if(i==0||i==this.alt-1){
                        stringer=stringer.concat("-");
                    } else if(j==0||j==this.larg-1){
                        stringer=stringer.concat("|");
                    } else {
                        stringer=stringer.concat(" ");
                    }
                }
                stringer=stringer.concat("\n");
            }
        } 
        if (this.codificacao.equals("UTF8")) {
            for (double i = 0; i < this.alt; i++) {    
                for (double j = 0; j < this.larg; j++) {
                    if(j==0&&i==0){
                        stringer=stringer.concat("\u250c"); 
                    } if(j==0&&i==this.alt-1){
                        stringer=stringer.concat("\u2514"); 
                    } else if(j==this.larg-1&&i==this.alt-1){
                        stringer=stringer.concat("\u2518"); 
                    }else if(j==this.larg-1&&i==0){
                        stringer=stringer.concat("\u2510"); 
                    }else if(i>0||i<this.alt-1){
                        if(j==0||j==this.larg){
                        stringer=stringer.concat("\u2502");
                        }
                    } else if(j>0||j<this.larg-1){
                        if(i==0||i==this.alt){
                            stringer=stringer.concat("\u2500");
                            }
                    } else {
                        stringer=stringer.concat(" ");
                    }
                }
                stringer=stringer.concat("\n");
            }
        } 
        return stringer;
    }
}
