
package br.com.jorge.study.BancoB.application;


import br.com.jorge.study.BancoB.entities.Conta;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        int qmenu = 4;
        Scanner teclado = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.out.println("Digite a sua senha: ");
        int senha = teclado.nextInt();
        if (senha == conta.getSenha()) {
            int continuidade = 1;
            System.out.println("*** Seja bem-vindo! ***");
            System.out.printf("Qual transação gostaria de realizar? %nDigite o número da opção %n1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
            continuidade = teclado.nextInt();
            
            while(continuidade > 0 && continuidade < qmenu){
                if(continuidade == 1){
                    System.out.printf("%nSaldo atual: R$ %.2f%n%n", conta.getSaldo());
                    System.out.println("Gostaria de realizar alguma transação?");
                    System.out.println("Digite a opção:");
                    System.out.printf("1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
                    continuidade = teclado.nextInt();
                    
                    if (continuidade < 0 || continuidade > 3) {
                        System.out.println("Opção inválida.");
                        System.out.println("Tente novamente:");
                        continuidade = teclado.nextInt();
                    }
                    
                }
                else if(continuidade == 2){
                    System.out.println("Digite o valor a depositar");
                    double depositando = teclado.nextDouble(); 
                    conta.deposito(depositando);
                    
                    System.out.println("Deposito recebido!");
                    System.out.printf("Saldo atual: R$ %.2f%n%n", conta.getSaldo());
                    
                    System.out.println("Gostaria de realizar mais alguma transação?");
                    System.out.println("Digite a opção:");
                    System.out.printf("1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
                    continuidade = teclado.nextInt();
                    
                    if (continuidade < 0 || continuidade > 3) {
                        System.out.println("Opção inválida.");
                        System.out.println("Tente novamente:");
                        continuidade = teclado.nextInt();
                    }
                    
                }
                else if (continuidade == 3){
                    System.out.println("Digite o valor do Saque: ");
                    double saque = teclado.nextDouble();
                    
                    if(saque > conta.getSaldo()){
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Verifique o saldo disponível.");
                        System.out.printf("Digite a opção:%n1 - Saldo%n2 - Deposito%n0 - Sair%n");
                        continuidade = teclado.nextInt();
                    }
                    else {
                        conta.saque(saque);
                        System.out.println("Saque realizado com sucesso!");
                        
                        System.out.println("Gostaria de verificar o saldo atual?");
                        System.out.printf("Digite a opção:%n1 - Saldo%n0 - Sair%n");
                        continuidade = teclado.nextInt();
                        
                        if (continuidade < 0 || continuidade > 3) {
                            System.out.println("Opção inválida.");
                            System.out.println("Tente novamente:");
                            continuidade = teclado.nextInt();
                        }
                    }
                    
                }
            }
            if (continuidade != 0) {
                System.out.println("Opção inválida, tente novamente.");
                continuidade = teclado.nextInt();
            }
            
            
            
        }
        else {
            System.out.println("Senha Errada! verifique a senha correta e tente novamente.");
        }
        
    }
}
