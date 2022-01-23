
package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioDoisIfElse {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        
        int N = teclado.nextInt();
        
        if(N % 2 == 0 ){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
}
