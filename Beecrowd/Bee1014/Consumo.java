
package br.com.jorge.Beecrowd.Bee1014;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Consumo {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        int km = teclado.nextInt();
        float L = teclado.nextFloat();
        
        double consumo = (double) km / L;
        
        System.out.printf("%.3f km/l%n",consumo);
    }
}
