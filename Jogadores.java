package jogo_poo;

public class Jogadores {

    private String nome;
    private String apelido;
    private String email;
    private String personagem;
    
    public Jogadores() {
        
    }
    
    public Jogadores(String nome, String apelido, String email, String personagem) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.personagem = personagem;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPersonagem() {
        return personagem;
    }
    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }
    
    @Override
    public String toString() {
        return nome + ":" + apelido + ":" + email + ":" + personagem;
    }
    
}
