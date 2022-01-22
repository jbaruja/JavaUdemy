package br.com.jorge.study.UdemyExer;

import java.util.Locale;



/**
 *
 * @author home
 */
public class UdemyExer {
    public static void main(String[]args){
        String produto1 = "PC Gamer";
        String produto2 = "Mesa Gamer";
        int age = 30;
        int code = 5290;
        char genero = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        
        System.out.println("Produtos:");
        System.out.printf("%s com valor de R$ %.2f%n",produto1,preco1);
        System.out.printf("%s com valor de R$ %.2f%n",produto2,preco2);
        System.out.printf("Registro: %d anos, código %d,genero %s%n%n",age,code,genero);
        System.out.printf("Medida com 8 casas decimais: %.8f%n",medida);
        System.out.printf("Arredondando para 3 casas decimais: %.3f%n",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Pontos decimais para USA: %.3f%n", medida);
    }
}


/**
 *  public static void main(String[] args) {
        String produto1 = "PC Gamer";
        String produto2 = "Mesa Gamer";

        int age = 30;
        int code = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, com valor de R$ %.2f%n", produto1, preco1);
        System.out.printf("%s, com valor de R$ %.2f%n%n", produto2, preco2);
        System.out.printf("Registro: %d anos, código %d e género: %s%n%n",age,code,genero);
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondando (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Pontos decimais USA: %.3f%n",medida);
    }
 */
