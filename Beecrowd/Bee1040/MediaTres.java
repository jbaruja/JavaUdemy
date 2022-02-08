
package br.com.jorge.Beecrowd.Bee1040;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class MediaTres {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        float A = teclado.nextFloat();
        float B = teclado.nextFloat();
        float C = teclado.nextFloat();
        float D = teclado.nextFloat();
        
        float media = (A * 2 + B * 3 + C * 4 + D * 1)/10;
        
        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
        float exame = teclado.nextFloat();
        
        System.out.printf("Nota do exame: %.1f%n", exame);
        media = (media + exame) / 2;
        
        
        
        
            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n",media);
            }
            else if(media <5.0){
                System.out.println("Aluno reprovado");
                System.out.printf("Media final: %.1f%n",media);
            }
        
        }
        
        
    }
}
