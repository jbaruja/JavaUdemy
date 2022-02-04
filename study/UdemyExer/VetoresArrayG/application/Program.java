
package br.com.jorge.study.UdemyExer.VetoresArrayG.application;

import br.com.jorge.study.UdemyExer.VetoresArrayG.entities.Hospedes;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int quartosdisp = 10;
        Hospedes[] vect = new Hospedes[quartosdisp];
        
        System.out.println("Quantos Hospedes?");
        int n = teclado.nextInt();
        
        for( int i = 1 ; i <= n ; i++){
            teclado.nextLine();
            System.out.println("Hospede # " + i);
            System.out.println("Digite o nome");
            String nome = teclado.nextLine();
            System.out.println("Digite o email");
            String email = teclado.nextLine();
            System.out.println("Digite o número do quarto escolhido 1 ao "+ quartosdisp);
            int quarto = teclado.nextInt();
            vect[quarto] = new Hospedes(nome, email);
        
        }
        System.out.println();
        System.out.println("Quartos ocupados");
        for(int i = 0; i < quartosdisp; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i] );
                
            }
        }
        
    }
}
