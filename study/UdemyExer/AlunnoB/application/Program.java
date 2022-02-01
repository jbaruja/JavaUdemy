
package br.com.jorge.study.UdemyExer.AlunnoB.application;

import br.com.jorge.study.UdemyExer.AlunnoB.entities.Estudante;
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
        
        Estudante estude = new Estudante();
        
        estude.nome = teclado.nextLine();
        estude.pTrim = teclado.nextDouble();
        estude.sTrim = teclado.nextDouble();
        estude.tTrim = teclado.nextDouble();
        
        System.out.printf("NOTAL FINAL = %.2f%n", estude.notaFinal());
        if(estude.notaFinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS", estude.falta());
        }
        else{
            System.out.println("APROVADO");
        }
        
    }
}
