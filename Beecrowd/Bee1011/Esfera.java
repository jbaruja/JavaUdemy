
package br.com.jorge.Beecrowd.Bee1011;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Esfera {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double PI = 3.14159;
        
        int R = teclado.nextInt();
        
        double volume = (4.0 / 3.0) * PI * Math.pow(R, 3);
        
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
