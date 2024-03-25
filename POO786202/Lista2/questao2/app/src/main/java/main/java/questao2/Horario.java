package main.java.questao2;

public class Horario {
    private int segundo;
    private int minuto;
    private int hora;

    public Horario() {
    }

    public Horario(int h) {
        if (h > 24 || h < 0) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        } else {
            this.hora = h;
        }
    }

    public Horario(int h, int m) {
        if (h > 24 || h < 0 || m > 60 || m < 0) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        } else {
            this.hora = h;
            this.minuto = m;
        }
    }

    public Horario(int h, int m, int s) {
        if (h > 24 || h < 0 || m > 60 || m < 0 || s > 60 || s < 0) {
            this.segundo = 0;
            this.minuto = 0;
            this.hora = 0;
        } else {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo > 60 || segundo < 0) {
            System.out.println("false");
        } else {
            this.segundo = segundo;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto > 60 || minuto < 0) {
            System.out.println("false");
        } else {
            this.minuto = minuto;
        }
    }

    public void setHora(int hora) {
        if (hora > 60 || hora < 0) {
            System.out.println("false");
        } else {
            this.hora = hora;
        }
    }

    public String toString() {
        return hora + ":" + minuto + ":" + segundo + ":";
    }

    public String extenso() {
        String horastr;
        String minutostr;
        String segundostr;

        switch (hora) {
            case 24:
                horastr = "Vinte e Quatro";
                break;
            case 23:
                horastr = "Vinte e Três";
                break;
            case 22:
                horastr = "Vinte e Dois";
                break;
            case 21:
                horastr = "Vinte e Um";
                break;
            case 20:
                horastr = "Vinte";
                break;
            case 19:
                horastr = "Dezenove";
                break;
            case 18:
                horastr = "Dezoito";
                break;
            case 17:
                horastr = "Dezessete";
                break;
            case 16:
                horastr = "Dezesseis";
                break;
            case 15:
                horastr = "Quinze";
                break;
            case 14:
                horastr = "Catorze";
                break;
            case 13:
                horastr = "Treze";
                break;
            case 12:
                horastr = "Doze";
                break;
            case 11:
                horastr = "Onze";
                break;
            case 10:
                horastr = "Dez";
                break;
            case 9:
                horastr = "Nove";
                break;
            case 8:
                horastr = "Oito";
                break;
            case 7:
                horastr = "Sete";
                break;
            case 6:
                horastr = "Seis";
                break;
            case 5:
                horastr = "Cinco";
                break;
            case 4:
                horastr = "Quatro";
                break;
            case 3:
                horastr = "Três";
                break;
            case 2:
                horastr = "Duas";
                break;
            case 1:
                horastr = "Uma";
                break;
            default:
                horastr = "";
                break;
        }

        switch (minuto / 10) {
            case 6:
                minutostr = "sessenta";
                break;
            case 5:
                minutostr = "cinquenta";
                break;
            case 4:
                minutostr = "quarenta";
                break;
            case 3:
                minutostr = "trinta";
                break;
            case 2:
                minutostr = "vinte";
                break;
            case 1:
                minutostr = "dez";
                break;
            default:
                minutostr = "";
                break;
        }

        if (minuto / 10 == 1) {
            switch (minuto % 10) {
                case 9:
                    minutostr += "dezenove";
                    break;
                case 8:
                    minutostr += "dezoito";
                    break;
                case 7:
                    minutostr += "dezessete";
                    break;
                case 6:
                    minutostr += "dezesseis";
                    break;
                case 5:
                    minutostr += "quinze";
                    break;
                case 4:
                    minutostr += "catorze";
                    break;
                case 3:
                    minutostr += "treze";
                    break;
                case 2:
                    minutostr += "doze";
                    break;
                case 1:
                    minutostr += "onze";
                    break;
                default:
                    break;
            }
        } else {
            switch (minuto % 10) {
                case 9:
                    minutostr += " e nove";
                    break;
                case 8:
                    minutostr += " e oito";
                    break;
                case 7:
                    minutostr += " e sete";
                    break;
                case 6:
                    minutostr += " e seis";
                    break;
                case 5:
                    minutostr += " e cinco";
                    break;
                case 4:
                    minutostr += " e quatro";
                    break;
                case 3:
                    minutostr += " e três";
                    break;
                case 2:
                    minutostr += " e duas";
                    break;
                case 1:
                    minutostr += " e um";
                    break;
                default:
                    break;
            }
        }

        switch (segundo / 10) {
            case 6:
                segundostr = "sessenta";
                break;
            case 5:
                segundostr = "cinquenta";
                break;
            case 4:
                segundostr = "quarenta";
                break;
            case 3:
                segundostr = "trinta";
                break;
            case 2:
                segundostr = "vinte";
                break;
            case 1:
                segundostr = "dez";
                break;
            default:
                segundostr = "";
                break;
        }

        if (segundo / 10 == 1) {
            switch (segundo) {
                case 9:
                    segundostr += "dezenove";
                    break;
                case 8:
                    segundostr += "dezoito";
                    break;
                case 7:
                    segundostr += "dezesete";
                    break;
                case 6:
                    segundostr += "dezesseis";
                    break;
                case 5:
                    segundostr += "quinze";
                    break;
                case 4:
                    segundostr += "catorze";
                    break;
                case 3:
                    segundostr += "treze";
                    break;
                case 2:
                    segundostr += "doze";
                    break;
                case 1:
                    segundostr += "onze";
                    break;
                default:
                    break;
            }
        } else

        {
            switch (segundo % 10) {
                case 9:
                    segundostr += " e nove";
                    break;
                case 8:
                    segundostr += " e oito";
                    break;
                case 7:
                    segundostr += " e sete";
                    break;
                case 6:
                    segundostr += " e seis";
                    break;
                case 5:
                    segundostr += " e cinco";
                    break;
                case 4:
                    segundostr += " e quatro";
                    break;
                case 3:
                    segundostr += " e três";
                    break;
                case 2:
                    segundostr += " e duas";
                    break;
                case 1:
                    segundostr += " e um";
                    break;
                default:
                    break;
            }
        }
        return horastr + " horas, " + minutostr + " minutos e " + segundostr + " segundos.";
    }
    public int segundos(){
        return (hora*3600)+(minuto*60)+(segundo);
    }
    public int diferenca(Horario a1){
        return this.segundos() - (a1.hora*3600)+(a1.minuto*60)+(a1.segundo);
    }
}
