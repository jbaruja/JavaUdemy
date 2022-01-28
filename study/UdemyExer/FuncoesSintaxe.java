package br.com.jorge.study.UdemyExer;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class FuncoesSintaxe {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

    }
    
    public static int max(int x, int y, int z) {
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
    
}
