
package br.com.jorge.study.ConcVElementos;

/**
 * Concatenando vários elementos
 * 
 * @author home
 */
public class ConcVElementos {
   public static void main(String[] args){
       String nome = "Maria";
       byte idade = 40;
       String cidade = "Camboriu";
       double renda = 4000.00;
       System.out.printf("A %s com %d anos de idade, mora em %s com uma renda aprox. de R$ %.2f%n", nome, idade, cidade,renda);
   }
    
}/* 
--- exec-maven-plugin:3.0.0:exec (default-cli) @ study ---
A Maria com 40 anos de idade, mora em Camboriu com uma renda aprox. de R$ 4000,00
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  0.929 s
Finished at: 2022-01-16T13:47:38-03:00
------------------------------------------------------------------------
*/
