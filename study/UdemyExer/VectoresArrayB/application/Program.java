package br.com.jorge.study.UdemyExer.VectoresArrayB.application;

import br.com.jorge.study.UdemyExer.VectoresArrayB.entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt(); // quebra de linha pendente,precisará um teclado.nextLine(); para consumir o Enter (quebra de linha)

        Product[] vect = new Product[n];
        for (int i = 0; i < vect.length; i++) {
            teclado.nextLine();
            String name = teclado.nextLine();
            double price = teclado.nextDouble();
            vect [i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double media = sum / vect.length;
        
        System.out.printf("MEDIA DE PREÇOS: %.2f%n", media );

    }
}
