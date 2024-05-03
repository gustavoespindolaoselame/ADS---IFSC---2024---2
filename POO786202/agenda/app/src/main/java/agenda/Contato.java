package agenda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public void Contato(String n, String s, LocalDate dN){
    }

    public boolean addTelefone(String r, String n){
        return true;
    }
    public boolean addEmail(String r, String e){
        return true;
    }
    public boolean removeTelefone(String r){
        return true;
    }
    public boolean removeEmail(String r){
        return true;
    }
    public boolean updateTelefone(String r, String n){
        return true;
    }
    public boolean updateEmail(String r, String e){
        return true;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }
}
