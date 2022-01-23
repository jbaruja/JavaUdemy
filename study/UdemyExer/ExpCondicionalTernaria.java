
package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExpCondicionalTernaria {
    public static void main(String[]args){
        double preco;
        double desconto;
        
        Scanner teclado = new Scanner(System.in);
        
        preco = teclado.nextDouble();
        desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;
        
        System.out.println("Desconto: " + desconto);
        
    }
}
