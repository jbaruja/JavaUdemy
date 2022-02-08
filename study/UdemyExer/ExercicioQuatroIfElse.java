
package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioQuatroIfElse {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
	}
}


/**
 * public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int in = teclado.nextInt();
        int fi = teclado.nextInt();
        
        if( in > fi){
            System.out.println("O JOGO DUROU " + (24-in + fi) + " HORAS");
        }  else if (in == fi) {
            System.out.println("O JOGO DUROU 24 HORAS");
        }        
        else {
            System.out.println("O JOGO DUROU " + (fi - in) + " HORAS");
        }
    }
 */