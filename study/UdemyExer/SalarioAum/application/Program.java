
package br.com.jorge.study.UdemyExer.SalarioAum.application;

import br.com.jorge.study.UdemyExer.SalarioAum.entities.Empregado;
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
        
        Empregado emp = new Empregado();
        
        System.out.println("Nome: ");
        emp.nome = teclado.nextLine();
        System.out.println("Salario Bruto: ");
        emp.salarioBruto = teclado.nextDouble();
        System.out.println("Impostos: ");
        emp.impostos = teclado.nextDouble();
        System.out.println();
        System.out.println("Empregado: " + emp);
        System.out.println();
        System.out.println("Qual a porcentagem do incremento salarial?");
        double porcentagem = teclado.nextDouble();
        emp.incrementoSalario(porcentagem);
        System.out.println("Dados Atualizados: " + emp);
    }
}
