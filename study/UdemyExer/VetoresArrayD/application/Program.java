
package br.com.jorge.study.UdemyExer.VetoresArrayD.application;

import br.com.jorge.study.UdemyExer.VetoresArrayC.entities.Inquilinos;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        
        Inquilinos[] vect = new Inquilinos[10];
        int n = teclado.nextInt();
        
        for (int i= 1; i<= n; i++){
            System.out.println();
            System.out.println("Inquilino # " + i + ":");
            System.out.println("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.println("Email: ");
            String email = teclado.nextLine();
            System.out.println("Quarto: ");
            int quarto = teclado.nextInt();
            vect[quarto] = new Inquilinos(nome, email);
            
        }
        
        System.out.println();
        System.out.println("Quartos alugados");
        for( int i = 0; i< 10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        
    }
}
