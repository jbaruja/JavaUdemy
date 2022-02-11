
package br.com.jorge.study.UdemyExer.MatrizC.application;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int M = teclado.nextInt();
        int N = teclado.nextInt();
        
        Integer [][] mat = new Integer [M][N];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j< mat[i].length; j++){
                mat[i][j] = teclado.nextInt();
            }
        }
        
        int ver = teclado.nextInt();
        
        for(int i =0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == ver){
                    System.out.println("Posição "+i+","+j+":");
                    if(j > 0){
                        System.out.println("Left: "+ mat[i][j-1]);
                    }
                    if(i>0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(j < mat[i].length-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i < mat.length-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        
    }
}
