
package br.com.jorge.study.UdemyExer.Banco.entities;

/**
 *
 * @author home
 */
public class Conta {
    private int numConta;
    private String nome;
    private double saldo;
    
    public Conta(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }
    
    public Conta(int numConta, String nome, double saldo){
        this.numConta= numConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public String nome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void deposito(double quantia){
        saldo += quantia;
    }
    
    public void saque(double quantia){
        saldo -= quantia + 5.0;
    }
    
    public String toString(){
        return "Conta "
                + numConta
                + ", Titular: "
                + nome
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
