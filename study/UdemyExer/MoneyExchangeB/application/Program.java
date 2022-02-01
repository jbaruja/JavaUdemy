
package br.com.jorge.study.UdemyExer.MoneyExchangeB.application;

import br.com.jorge.study.UdemyExer.MoneyExchangeB.entities.Cotacao;
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
        
        System.out.println("Qual a cotação do Dollar?");
        Cotacao.vdollar = teclado.nextDouble();
        System.out.println("Quantos dolares precisa?");
        Cotacao.qdollar = teclado.nextDouble();
        System.out.printf("Voce precisa pagar em Reais o total de %.2f", Cotacao.trocai());
    }
}

/** CORRECAO
 * package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;
public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
System.out.print("What is the dollar price? ");
double dollarPrice = sc.nextDouble();
System.out.print("How many dollars will be bought? ");
double amount = sc.nextDouble();
double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
System.out.printf("Amount to be paid in reais = %.2f%n", result);
sc.close();
}
}
 */