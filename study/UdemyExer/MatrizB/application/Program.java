package br.com.jorge.study.UdemyExer.MatrizB.application;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int M = teclado.nextInt();
        int N = teclado.nextInt();

        Integer [][] mat = new Integer [M][N];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }
        
        int ver = teclado.nextInt();
        
        int getIndex = Arrays.asList(mat).indexOf(ver);
        
        System.out.println("localização "+ getIndex);
        
        

    }
}
