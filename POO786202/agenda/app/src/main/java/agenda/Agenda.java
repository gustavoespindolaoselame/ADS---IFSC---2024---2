package agenda;
import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda{
    private ArrayList<Contato> contatos;

    public void Agenda(){
    }
    public boolean addContato(Contato c){
        return true;
    }
    public boolean addTelefone(String r, String n, Contato c){
        c.addTelefone(r, n);
        return true;
    }
    public boolean addEmail(String r, String e, Contato c){
        c.addEmail(r, e);
        return true;
    }
    public boolean removeTelefone(String r, Contato c){
        c.removeTelefone(r);
        return true;
    }
    public boolean removeEmail(String r, Contato c){
        c.removeEmail(r);
        return true;
    }
    public boolean updateTelefone(String r, String n, Contato c){
        return true;
    }
    public boolean updateEmail(String r, String e, Contato c){
        return true;
    }
}