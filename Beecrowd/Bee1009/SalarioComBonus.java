
package br.com.jorge.Beecrowd.Bee1009;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class SalarioComBonus {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        String nome = teclado.nextLine();
        double salario = teclado.nextDouble();
        double vendas = teclado.nextDouble();
        
        double comissao = vendas * 0.15;
        
        System.out.printf("TOTAL = R$ %.2f%n",(salario+comissao));
    }
}
