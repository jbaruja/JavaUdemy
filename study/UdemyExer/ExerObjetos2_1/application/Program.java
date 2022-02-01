
package br.com.jorge.study.UdemyExer.ExerObjetos2_1.application;

import br.com.jorge.study.UdemyExer.ExerObjetos2_1.entities.Product;
import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author home
 */
public class Program {
    
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese os dados do produto: ");
        System.out.println("Nome: ");
        String name = teclado.nextLine();
        System.out.println("Preço: ");
        double price= teclado.nextDouble();
        System.out.println("Quantidade no estoque: ");
        int quantity = teclado.nextInt();
        
        Product product = new Product(name, price, quantity);
        
        System.out.println();
        System.out.println("Dados do Produto: " + product);
        
        System.out.println();
        System.out.println("Digite a quantidade do produto a adicionar no estoque: ");
        quantity = teclado.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Atualizando dados: " + product);
        
        System.out.println();
        System.out.println("Digite a quantidade do produto a remover do estoque: ");
        quantity = teclado.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Atualizando dados: " + product);
        
    }
}
