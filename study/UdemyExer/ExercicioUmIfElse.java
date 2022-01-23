
package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioUmIfElse {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        
        if(valor < 0){
            System.out.println("NEGATVO");
        }else {
            System.out.println("NAO NEGATIVO");
        }
        
        
    }
}
