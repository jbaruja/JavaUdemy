
package br.com.jorge.Beecrowd.Bee1010;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class CalculoSimples {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
       
        int cod1 = teclado.nextInt();
        int qde1 = teclado.nextInt();
        double valor1 = teclado.nextDouble();
        int cod2 = teclado.nextInt();
        int qde2 = teclado.nextInt();
        double valor2 = teclado.nextDouble();
        
        double total = (valor1 * qde1) + (valor2*qde2); 
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
        
    }    
    
}
