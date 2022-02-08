
package br.com.jorge.Beecrowd.Bee1018;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Cedulas {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int cem = 0;
        int cinq = 0;
        int vin = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        
        int VALOR = teclado.nextInt();
        int N = VALOR;
        
        if(N >= 100){
            cem = N / 100;
        }
        N -= cem * 100;
        
        if (N >= 50) {
            cinq = N / 50;
        }
        N -= cinq * 50;
        
        if (N >= 20) {
            vin = N / 20;
        }
        N -= vin * 20;
        
        if (N >= 10) {
            dez = N / 10;
        }
        N -= dez * 10;
        
        if (N >= 5) {
            cinco = N / 5;
        }
        N -= cinco * 5;
        
        if (N >= 2) {
            dois = N / 2;
        }
        N -= dois * 2;
        
        if (N >= 1) {
            um = N / 1;
        }
        N -= um * 1;
        
        System.out.println(VALOR);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vin + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
        
    }
}
