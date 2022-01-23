package br.com.jorge.study.UdemyExer.MateriaisDesafios;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExercicioTresIfElse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();

        if (a >= b) {
            int maior = a;
            int verif = a % b;
            if (verif == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        } else {
            int verif = b % a;
            if (verif == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }

    }
}


/***
 * CORREÇÃO DO PROF
 * import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
 */