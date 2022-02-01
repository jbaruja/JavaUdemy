
package br.com.jorge.study.BancoB.entities;

/**
 *
 * @author home
 */
public class Conta {
    private int senha = 7788;
    private double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public void deposito(double quantia){
        saldo += quantia;
    }
    
    public void saque(double quantia){
        saldo -= quantia;
    }
    
    public String toString(){
        return " Saldo disponível: "
                + String.format("%.2f", saldo);
    }
    
}
