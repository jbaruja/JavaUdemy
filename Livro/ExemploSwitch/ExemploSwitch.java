package br.com.jorge.Livro.ExemploSwitch;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExemploSwitch {

    public static void main(String[] args) {
        String a = "Itajai";
        String b = "Camboriu";
        String c = "Itapema";
        String d = "Balneário";
        System.out.println("Em qual cidade tem o Pico da Pedra?");
        System.out.println("Digite a para " + a);
        System.out.println("Digite b para " + b);
        System.out.println("Digite c para " + c);
        System.out.println("Digite d para " + d);
        Scanner teclado = new Scanner(System.in);
        char letra = teclado.next().charAt(0);
        switch (letra) {
            case 'a':
                System.out.println("Errado, mas em " + a + " tem o Bico do Papagaio.");
                break;
            case 'b':
                System.out.println("Correto!! o Pico da Pedra está localizado em " + b + ".");
                break;
            case 'c':
                System.out.println("Errado, o Pico da Pedra não está em " + c + ".");
                break;
            case 'd':
                System.out.println("Errado! em " + d + " tem o Pico da Teta.");
                break;
            default:
                System.out.println("Digite a b c ou d ");

        }
    }
}
