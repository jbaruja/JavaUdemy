
package br.com.jorge.study.UdemyExer;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioDois {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        Scanner teclado = new Scanner (System.in);
        
        double raio = teclado.nextDouble();
        double circunsferencia = pi * (raio * raio);
        System.out.printf("A=%.4f.%n", circunsferencia);
                
    }
    
}
