package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class ExerSwitchCase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();
        String dia;

        switch (X) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
        }
        
        System.out.println("Dia da semana " + dia);

    }
}

  