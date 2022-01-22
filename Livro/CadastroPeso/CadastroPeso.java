package br.com.jorge.Livro.CadastroPeso;

import java.util.Scanner;


/**
 *
 * @author home
 */
public class CadastroPeso {
    public static void main(String[] args){
        String nome1 = "";
        String nome2 = "";
        float peso1 = 0f;
        float peso2 = 0f;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa 1");
        nome1 = teclado.next();
        System.out.println("Olá " + nome1 +"! Digite o seu peso");
        peso1 = teclado.nextFloat();
        System.out.println("Digite o nome da pessoa 2");
        nome2 = teclado.next();
        System.out.println("Digite o seu peso");
        peso2 = teclado.nextFloat();
        System.out.println("");
        System.out.println("Obrigado!!");
        System.out.println("SEGUE O RELATORIO DE PESOS");
        System.out.println(nome1 + " pesa " + peso1 + "Kg");
        System.out.println(nome2 + " pesa " + peso2 + "Kg");
        System.out.printf("Totalizando " + (peso1 + peso2));
}
    
    
    
    
    
    
    
    
    
/*
    public static void main(String[] arg) {
        String nome1 = "";
        String nome2 = "";
        float peso1 = 0f;
        float peso2 = 0f;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome 1:");
        nome1 = teclado.next();
        System.out.println("Olá " + nome1 + "! digite o seu peso ");
        peso1 = teclado.nextFloat();
        System.out.println("Digite o nome 2:");
        nome2 = teclado.next();
        System.out.println("Olá " + nome2 + "! digite o seu peso ");
        peso2 = teclado.nextFloat();

        System.out.println("Obrigado!");
        System.out.printf("A pessoa1: %s tem %.2f Kg%n", nome1, peso1);
        System.out.printf("A pessoa2: %s tem %.2f Kg%n", nome2, peso2);

    }*/
}
