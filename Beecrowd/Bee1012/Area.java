
package br.com.jorge.Beecrowd.Bee1012;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Area {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        double PI = 3.14159;
        
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        
        double Atriangulo = A * C / 2;
        double Acirculo = C * C * PI;
        double Atrapezio = (A + B) * C / 2;
        double Aquadrado = B * B;
        double Aretangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n",Atriangulo);
        System.out.printf("CIRCULO: %.3f%n",Acirculo);
        System.out.printf("TRAPEZIO: %.3f%n",Atrapezio);
        System.out.printf("QUADRADO: %.3f%n",Aquadrado);
        System.out.printf("RETANGULO: %.3f%n",Aretangulo);
    }
}
