
package br.com.jorge.study.Beecrowd.application;

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
       
       int num = teclado.nextInt();
       int horas = teclado.nextInt();
       double vhoras = teclado.nextDouble();
       
       double salario = (horas * vhoras);
       
        System.out.println("NUMBER = "+ num);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
