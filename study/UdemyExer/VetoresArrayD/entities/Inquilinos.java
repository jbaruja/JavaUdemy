
package br.com.jorge.study.UdemyExer.VetoresArrayD.entities;

/**
 *
 * @author home
 */
public class Inquilinos {
    private String nome;
    private String email;

    public Inquilinos(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    @Override
    public String toString() {
        return "Inquilinos{" + "nome=" + nome + ", email=" + email + '}';
    }
    
    
    
    
}
