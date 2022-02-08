package br.com.jorge.Beecrowd.Bee1021;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class NotasEMoedas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double N = teclado.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");
        valor = (int) (N / 100);
        System.out.printf("%d nota(s) de R$ 100.00%n", valor);
        N = N % 100.0;

        valor = (int) (N / 50);
        System.out.printf("%d nota(s) de R$ 50.00%n", valor);
        N = N % 50.0;

        valor = (int) (N / 20);
        System.out.printf("%d nota(s) de R$ 20.00%n", valor);
        N = N % 20.0;

        valor = (int) (N / 10);
        System.out.printf("%d nota(s) de R$ 10.00%n", valor);
        N = N % 10.0;

        valor = (int) (N / 5);
        System.out.printf("%d nota(s) de R$ 5.00%n", valor);
        N = N % 5.0;

        valor = (int) (N / 2);
        System.out.printf("%d nota(s) de R$ 2.00%n", valor);
        N = N % 2.0;

        System.out.println("MOEDAS:");
        N = N * 100;
        valor = (int) (N / 100);
        System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
        N = N % 100.0;

        valor = (int) (N / 50);
        System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
        N = N % 50;
        
        valor = (int) (N / 25);
        System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
        N = N % 25;
        
        valor = (int) (N / 10);
        System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
        N = N % 10;
        
        valor = (int) (N / 5);
        System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
        N = N % 5;
        
        valor = (int) (N / 1);
        System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
        
    }
}
