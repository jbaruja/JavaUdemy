
package br.com.jorge.study.UdemyExer.SalarioAum.entities;

/**
 *
 * @author home
 */
public class Empregado {
    public String nome;
    public double salarioBruto;
    public double impostos;
    
    public double salarioLiquido(){
        return salarioBruto - impostos;
    }
    
    public void incrementoSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    
    public String toString(){
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
