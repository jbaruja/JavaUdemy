
package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioCincoIfElse {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int codigo = teclado.nextInt();
        int quantidade = teclado.nextInt();
        
        double total;
        if(codigo == 1){
            total = quantidade * 4;
        }
        else if(codigo == 2 ){
            total = quantidade * 4.5;
        }
        else if(codigo == 3) {
            total = quantidade * 5;
        }
        else if(codigo == 4) {
            total = quantidade * 2;
        }
        else {
            total = quantidade *- 1.5;
        }
        
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
