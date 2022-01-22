package br.com.jorge.Livro.TesteArrays;

import java.util.Scanner;

/**
 * Testando atribuir Arrays com laço
 * @author home
 */
public class TesteArrays {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros inteiros:");
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

}

/*
    int[] numeros = new int[10];
        System.out.println("Digite 10 numeros inteiros:");
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }

public static void main(String[] args) {
        String[] inventores = new String[4];
        inventores[0] = "Einstein";
        inventores[1] = "Edson";
        inventores[2] = "Galileu";
        inventores[3] = "Da Vinci";
        System.out.println(inventores[2]);
    }
*/
