
package br.com.jorge.study.UdemyExer.Banco.application;

import br.com.jorge.study.UdemyExer.Banco.entities.Conta;
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
        Conta conta;
        
        System.out.println("Digite o número da conta: ");
        int numero = teclado.nextInt();
        System.out.println("Digite o nome do Titular: ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("Tem deposito inicial (s/n) ? ");
        char resposta = teclado.next().charAt(0);
        if( resposta == 's'){
            System.out.println("Digite o deposito inicial: ");
            double depositoInicial = teclado.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        }
        else {
            conta = new Conta(numero, nome);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Digite o valor de um deposito: ");
        double valorDeposito = teclado.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Digite o valor de um saque: ");
        double valorsaque = teclado.nextDouble();
        conta.saque(valorsaque);
        System.out.println("Daos atualizados da conta: ");
        System.out.println(conta);
    }
}
