package br.com.jorge.study.UdemyExer;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioSeis {

    public static void main(String[] args) {
        float A, B, C;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        float triangulo = (A * C) / 2;
        double circulo = (float) pi * (C * C);
        float trapezio = ((A + B) * C) / 2;
        float quadrado = B * B;
        float retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
