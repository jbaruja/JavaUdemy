package br.com.jorge.study.Máquina2;

import java.io.PrintStream;
import java.util.Locale;

/**
 * Escrever o conteúdo de uma variável com ponto flutuante // Regular as casas
 * decimais para 2 // Somar uma variavel int a uma double regulando as casas
 * decimais // Combinar/concatenar com textos // printf imprime no formato do
 * PC, resolver isso com Locale // concatenar com $f
 *
 * @author home
 */
public class Máquina2 {

    public static void main(String[] args) {
        int r = 250;
        double z = 300.2187956;
        double t = 231.548794;
        System.out.printf("valor de z " + "%.2f%n", z);
        System.out.printf("valor de t " + "%.2f%n",t);
        System.out.println("valor de r " + r);
        System.out.printf("Soma de r + t " + "%.2f%n",t + r);
        System.out.println("corrigindo simbolo de decimal");
        Locale.setDefault(Locale.US);
        System.out.printf("Soma de r + t " + "%.2f%n",t + r);
        System.out.println();
        
            
    }
}
