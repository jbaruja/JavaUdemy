
package br.com.jorge.study.UdemyExer.VetoresArrayF.application;

import br.com.jorge.study.UdemyExer.VetoresArrayF.entities.Hospedes;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de quartos:");
        int n = teclado.nextInt();
        Hospedes[] vect = new Hospedes[20];
        
        for( int i = 1 ; i<= n ; i++){
            teclado.nextLine();
            System.out.println("Hospede # " + i + ":");
            System.out.println("Digite o nome: ");
            String nome = teclado.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = teclado.nextLine();
            System.out.println("Digite o email: ");
            String email = teclado.nextLine();
            System.out.println("Digite o UF: ");
            String uf = teclado.nextLine();
            System.out.println("Estado: ");
            String estado = teclado.nextLine();
            System.out.println("Digite a Cidade: ");
            String cidade = teclado.nextLine();
            System.out.println("Digite o bairro: ");
            String bairro = teclado.nextLine();
            System.out.println("Digite o Logradouro: ");
            String logradouro = teclado.nextLine();
            System.out.println("Digite o numero: ");
            int numero = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Digite uma observação: ");
            String obs = teclado.nextLine();
            System.out.println("Digite o quarto escolhido: ");
            int quarto = teclado.nextInt();
            
            vect[quarto] = new Hospedes(nome, cpf, email, uf, estado, cidade, bairro, logradouro, numero, obs);
        }
        
        System.out.println();
        System.out.println("Quarto alugados: ");
        for(int i = 0 ; i <= n ; i++){
            if (vect[i] != null ){
                System.out.println( i + ": " + vect[i]);
            }
        }

    }
}
