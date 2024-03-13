package introduçao_ao_paradigma;
public class Pessoa {
    private String CPF;
    private String nome;
    private String email;

    @Override
    public String toString() {
        return "Pessoa [CPF=" + CPF + ", nome=" + nome + ", email=" + email + "]";
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
