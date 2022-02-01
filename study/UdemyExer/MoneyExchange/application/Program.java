
package br.com.jorge.study.UdemyExer.MoneyExchange.application;

import br.com.jorge.study.UdemyExer.MoneyExchange.entities.Cotacao;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a cotação do Dolar? ");
        Cotacao.vdollar = teclado.nextDouble();
        System.out.println("Quantos dolares precisa?");
        Cotacao.saledollar = teclado.nextDouble();
        System.out.printf("Precisa pagar em Reais =  %.2f",Cotacao.cotai());
        
    }
}
