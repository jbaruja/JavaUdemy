package br.com.jorge.study.Banco;

import java.util.Scanner;

/**
 * Objetivo de simular transações bancárias como, deposito, saque, saldo.
 *
 * @author home 
 */
public class Caixa {

    public static void main(String[] args) {
        double saldo = 0, deposito, saque, continuidade;
        int qopcoes = 4, verificasenha = 7788;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua senha:");
        int senha = teclado.nextInt();

        if (senha == verificasenha) {
            continuidade = 1;
            System.out.println("*** Seja bem-vindo! ***");
            System.out.printf("Qual transação gostaria de realizar? %nDigite o número da opção %n1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
            continuidade = teclado.nextDouble();
            
                while (continuidade > 0 && continuidade < qopcoes) {

                    if (continuidade == 1) {
                        System.out.printf("%nSaldo atual: R$ %.2f%n%n", saldo);
                        System.out.println("Gostaria de realizar alguma transação?");
                        System.out.println("Digite a opção:");
                        System.out.printf("1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
                        continuidade = teclado.nextDouble();
                        
                        if(continuidade < 0 || continuidade > 3){
                            System.out.println("Opção inválida.");
                            System.out.println("Tente novamente:");
                            continuidade = teclado.nextDouble();
                        }
                        
                        
                    } else if (continuidade == 2) {
                        System.out.println("Digite o valor a depositar:");
                        deposito = teclado.nextDouble(); // ver como bloquear digitos de valores negativos

                        saldo = saldo + deposito;

                        System.out.println("Deposito recebido!");
                        System.out.printf("Saldo atual: R$ %.2f%n%n", saldo);

                        System.out.println("Gostaria de realizar mais alguma transação?");
                        System.out.println("Digite a opção:");
                        System.out.printf("1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n");
                        continuidade = teclado.nextDouble();
                        
                        if (continuidade < 0 || continuidade > 3) {
                            System.out.println("Opção inválida.");
                            System.out.println("Tente novamente:");
                            continuidade = teclado.nextDouble();
                        }

                    } else if (continuidade == 3) {
                        System.out.println("Digite o valor do Saque:");
                        saque = teclado.nextDouble(); // bloquear digitos de valores negativos

                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                            System.out.println("Verifique o saldo disponível.");
                            System.out.printf("Digite a opção:%n1 - Saldo%n2 - Deposito%n0 - Sair%n");
                            continuidade = teclado.nextDouble();
                            
                            
                        } else {
                            System.out.println("Saque realizado com sucesso!");
                            saldo = saldo - saque;

                            System.out.println("Gostaria de verificar o saldo atual?");
                            System.out.printf("Digite a opção:%n1 - Saldo%n0 - Sair%n");
                            continuidade = teclado.nextDouble();
                            
                            if (continuidade < 0 || continuidade > 1) {
                                System.out.println("Opção inválida.");
                                System.out.println("Tente novamente:");
                                continuidade = teclado.nextDouble();
                            }
                        }

                    } else {

                    }
                }
                if(continuidade != 0){
                System.out.println("Opção inválida, tente novamente.");
                continuidade = teclado.nextDouble();                    
                }
            

        } else {
            System.out.println("Senha Errada! verifique a senha correta e tente novamente.");
        }

    }

}

/**
 * TESTE ANTERIOR vv public static void main(String[] args) { double saldo = 0;
 * int chave = 0; do {
 *
 * System.out.println("Digite a sua senha:"); Scanner teclado = new
 * Scanner(System.in); int senha = teclado.nextInt(); if (senha == 7788) {
 *
 * } else { System.out.println("Senha errada"); } System.out.println("Seja
 * bem-vindo!"); System.out.printf("Qual transação gostaria de realizar?
 * %nDigite o número da opção %n1 - Saldo%n2 - Deposito%n3 - Saque%n0 -
 * Sair%n"); System.out.println("Obs: chave" + chave); chave =
 * teclado.nextInt(); switch (chave) { case 1: System.out.printf("Saldo atual:
 * %.2f%n", saldo); System.out.printf("Caso precise realizar mais alguma
 * transação: %nDigite a opção: %n1 - Deposito%n2 - Saque%n0 - Sair%n");
 *
 * System.out.println("Obs: chave: " + chave);//só para mostrar com qual valor
 * está chave = teclado.nextInt();
 *
 * case 2: System.out.println("Digite o valor de Depósito:"); double deposito =
 * teclado.nextFloat(); saldo = deposito + saldo; System.out.printf("Deposito
 * recebido, o saldo atual é: %.2f%n", saldo); System.out.printf("Caso precise
 * realizar mais alguma transação: %nDigite a opção: %n1 - Deposito%n2 -
 * Saque%n0 - Sair%n"); chave = -1; System.out.println("Obs: chave: " + chave);
 * chave = teclado.nextInt();
 *
 * case 3: System.out.println("Digite o valor de Saque:"); double saque =
 * teclado.nextFloat(); if (saque > saldo) { System.out.println("Saldo
 * insuficiente, verifique o saldo disponível."); System.out.printf("Caso
 * precise realizar mais alguma transação: %nDigite a opção: %n1 - Saldo %n2 -
 * Deposito%n0 - Sair%n"); chave = 0; System.out.println("Obs: chave: " +
 * chave); chave = teclado.nextInt(); } else { saldo = saldo - saque;
 * System.out.printf("Saque realizado, o saldo atual é: R$ %.2f%nCaso precise
 * realizar mais alguma transação: %nDigite a opção: %n1 - Deposito %n2 -
 * Saque%n0 - Sair%n", saldo); chave = 0; System.out.println("Obs: chave" +
 * chave); chave = teclado.nextInt(); }
 *
 * default: System.out.println("Opção inválida"); } } while (chave == 0);
 *
 * }
 */
