package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioTres {

    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        Scanner teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca);

    }

}
