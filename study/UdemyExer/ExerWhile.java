package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExerWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int total = 0;
        while (x != 0) {
            total = total + x;
            x = teclado.nextInt();
        }

        System.out.println(total);

    }
}
