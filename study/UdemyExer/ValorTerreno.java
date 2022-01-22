package br.com.jorge.study.UdemyExer;

import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author home
 */
public class ValorTerreno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        double largura = teclado.nextDouble();
        double comprimento = teclado.nextDouble();
        double metroQuadrado = teclado.nextDouble();
        
        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        
        
        
    }
}


/** 
        double largura, comprimento, area;
        Float mQuadrado, vMercado;
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a largura do terreno:");
        largura = teclado.nextDouble();
            System.out.println("Digite o comprimento do terreno:");
        comprimento = teclado.nextDouble();
            System.out.println("Digite o valor do metro²:");
        mQuadrado = teclado.nextFloat();
        area = largura * comprimento;
        vMercado = (float) area * mQuadrado;
            System.out.printf("O terreno tem uma área de %.2f m²%n", area);
            System.out.printf("Com um valor de mercado de: R$ %.2f%n", vMercado);
 */