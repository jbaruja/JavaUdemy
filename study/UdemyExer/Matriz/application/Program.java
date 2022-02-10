package br.com.jorge.study.UdemyExer.Matriz.application;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        
        System.out.println();
        
        int count = 0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]< 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);
        

    }
}
