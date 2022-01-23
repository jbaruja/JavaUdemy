
package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author home
 */
public class ExercicioOitoIfElse {
    public static void main(String[]args){
       Locale.setDefault(Locale.US);
       Scanner teclado = new Scanner(System.in);
       
       double renda = teclado.nextDouble();
       double isento = 2000.00, leao;
       
       if(renda <= isento){
           leao = 0.0;
       }else if (renda <= 3000.0){
           leao = (renda - isento) * 0.08;
       }else if (renda <= 4500.00){
           leao = (renda - 3000.0) * 0.18 + 1000 * 0.08;
           
       }
       else{
           leao = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
       }
       
       if(leao == 0.00){
           System.out.println("Isento");
       } else {
           System.out.printf("R$: ", leao);
       }
       
    }
}







/**
 *      Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner (System.in);
        
        double renda = teclado.nextDouble();
        double limite = 2000.00;
        double leao = renda - limite;
        
        if(renda <= limite){
            leao = 0.0;
        }else if (renda <= 3000.0){
            leao = (renda - limite) * 0.08;
        }else if( renda <= 4500.0){
            leao = (renda - 3000.00) * 0.18 + 1000.0 * 0.08;
        }
        else {
            leao = (renda - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
        }
        
        if(leao == 0.0){
            System.out.println("Isento");
        }
        else{
            System.out.printf("R$ %.2f%n", leao);
        }
        
 */