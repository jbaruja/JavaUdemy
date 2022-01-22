package br.com.jorge.study.UdemyExer;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioQuatro {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int num, horas;
        double vhora, salario;

        num = teclado.nextInt();
        horas = teclado.nextInt();
        vhora = teclado.nextDouble();
        
        salario = (Double) vhora * horas;
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
