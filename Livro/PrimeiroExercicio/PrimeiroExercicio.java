
package br.com.jorge.Livro.PrimeiroExercicio;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class PrimeiroExercicio {
    public static void main(String[] args){
        int x = 0;
        System.out.println("Digite um valor inteiro para x:");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        
        System.out.println("Variável x " + x );
    }
}
