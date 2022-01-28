
package br.com.jorge.study.UdemyExer.RectanguloDois.application;

import br.com.jorge.study.UdemyExer.Rectangulo.entities.Rectangulo;
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
        
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Digite a largura e altura do Rectangulo:");
        rectangulo.altura = teclado.nextDouble();
        rectangulo.largura=teclado.nextDouble();
        
        System.out.println(rectangulo);
      
    }
    
    
}
