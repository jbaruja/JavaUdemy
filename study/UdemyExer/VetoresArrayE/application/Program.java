package br.com.jorge.study.UdemyExer.VetoresArrayE.application;

import br.com.jorge.study.UdemyExer.VetoresArrayE.entities.Inquilinos;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Inquilinos[] vect = new Inquilinos[10];

        System.out.println("Quantos quartos vai alugar?");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Inquilino # " + i + ":");
            System.out.println("Nome");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.println("Digite o email: ");
            String email = teclado.nextLine();
            System.out.println("Digite o número do quarto escolhido: ");
            int quarto = teclado.nextInt();
            vect[quarto] = new Inquilinos(nome, email);
        }
        
        System.out.println();
        System.out.println("Quarto alugados: ");
        for( int i = 0 ; i<10; i++){
            if(vect[i] != null){
                System.out.println(i + ":" + vect[i]);
            }
        }

    }
}
