
package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioSeisIfElse {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double numero = teclado.nextDouble();
        
        if (numero < 0.0 || numero > 100.0){
            System.out.println("Fora dos intervalos");
        }
        else if(numero <= 25.0){
            System.out.println("Intervalo 0,25");
        }
        else if(numero <= 50.0){
            System.out.println("Intervalo 25,50");
        }
        else if(numero <= 75.0){
            System.out.println("Intervalo 50,75");
        }
        else {
            System.out.println("Intervalo 75,100");
        }
    }
}


/**
 * double a = teclado.nextDouble();
        
        if( a >= 0 && a <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if (a > 25 && a <= 50) {
            System.out.println("Intervalo [25,50]");
        }
        else if(a > 50 && a <= 75) {
            System.out.println("Intervalo [50,75]");
        }
        else if(a > 75 && a <= 100) {
            System.out.println("Intervalo [75,100]");
        }
        else {
            System.out.println("Fora dos intervalos");
        }
 */