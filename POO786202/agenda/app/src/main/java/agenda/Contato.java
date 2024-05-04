package agenda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;
    public Contato(String n, String s, LocalDate dN) {
        this.nome=n;
        this.sobrenome=s;
        this.dataNasc=dN;
    }
    public boolean addTelefone(String r, String n){       
        return telefones.add(new Telefone(r, n));
    }
    public boolean addEmail(String r, String e){       
        return emails.add(new Email(r, e));
    }
    public boolean removeTelefone(String r){       
        return telefones.remove(r);
    }
    public boolean removeEmail(String r){
        return emails.remove(r);
    }
    public boolean updateTelefone(String r, String n){
        telefones.set(telefones.indexOf(r), new Telefone(r, n));
        return true;
    }
    public boolean updateEmail(String r, String e){
        emails.set(emails.indexOf(r), new Email(r, e));
        return true;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }
}
