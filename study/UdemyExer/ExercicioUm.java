
package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioUm {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int A, B, soma;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        soma = A + B;
        
        System.out.println("SOMA = " + soma);
        
    }
}


/**
 *  public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        System.out.println("SOMA = " + (a + b));
    }
 */