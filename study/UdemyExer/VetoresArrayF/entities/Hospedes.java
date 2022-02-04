
package br.com.jorge.study.UdemyExer.VetoresArrayF.entities;

/**
 *
 * @author home
 */
public class Hospedes {
    private String nome;
    private String cpf;
    private String email;
    private String uf;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;
    private String obs;

    public Hospedes(String nome, String cpf, String email, String uf, String estado, String cidade, String bairro, String logradouro, int numero, String obs) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.uf = uf;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.obs = obs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "Hospedes{" + "Nome= " + nome + ", CPF= " + cpf + ", email= " + email + ", UF= " + uf + ", Estado=" + estado + ", Cidade=" + cidade + ", Bairro=" + bairro + ", Logradouro=" + logradouro + ", Numero=" + numero + ", Obs=" + obs + '}';
    }
    
    
    
}
