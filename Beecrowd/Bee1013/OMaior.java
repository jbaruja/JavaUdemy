
package br.com.jorge.Beecrowd.Bee1013;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class OMaior {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        int ver = (a+b+abs(a-b)) / 2;
        int res = (ver+c+abs(ver-c)) / 2;
        
        System.out.println(res + " eh o maior");
    }
}
