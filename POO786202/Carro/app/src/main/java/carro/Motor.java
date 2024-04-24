package carro;

public class Motor {
    private Integer cilindradas;
    private Integer hp;

    public Motor(Integer cilindradas, Integer hp) {
        this.cilindradas = cilindradas;
        this.hp = hp;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    
}
