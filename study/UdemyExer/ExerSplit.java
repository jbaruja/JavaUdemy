
package br.com.jorge.study.UdemyExer;

/**
 *
 * @author home
 */
public class ExerSplit {
    public static void main(String[]args){
        String s = "potato,apple,lemon";
        String[] vect = s.split(",");
        
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
