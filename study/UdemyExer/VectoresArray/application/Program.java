
package br.com.jorge.study.UdemyExer.VectoresArray.application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        double [] vect = new double[n];
        
        for(int i=0; i<n; i++){
            vect[i] = teclado.nextDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i];
        }
        
        double media = sum / n;
        
        System.out.printf("MEDIA: %.2f%n", media);
        
    }
}
