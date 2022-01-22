package br.com.jorge.study.UdemyExer;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioCinco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int cod1, cod2, qde1, qde2;
        double valor1, valor2, total;

        cod1 = teclado.nextInt();
        qde1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        
        cod2 = teclado.nextInt();
        qde2 = teclado.nextInt();
        valor2 = teclado.nextDouble();

        total = (double) valor1 * qde1 + valor2 * qde2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }

}
