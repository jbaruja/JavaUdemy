package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
 * alguma).
 *
 * @author home
 */
public class ExerDoisWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        int Y = teclado.nextInt();

        while (!(X == 0 || Y == 0)) {
            if (X > 0 && Y > 0) {
                System.out.println("Primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            X = teclado.nextInt();
            Y = teclado.nextInt();
        }

    }

}
