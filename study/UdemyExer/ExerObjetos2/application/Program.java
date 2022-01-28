
package br.com.jorge.study.UdemyExer.ExerObjetos2.application;

import br.com.jorge.study.UdemyExer.ExerObjetos2.entities.Product;
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
        
        
        Product product = new Product();
        System.out.println("Ingrese os dados do produto: ");
        System.out.println("Nome: ");
        product.name = teclado.nextLine();
        System.out.println("Preço: ");
        product.price= teclado.nextDouble();
        System.out.println("Quantidade no estoque: ");
        product.quantity = teclado.nextInt();
        
        System.out.println();
        System.out.println("Dados do Produto: " + product);
        
        System.out.println();
        System.out.println("Digite a quantidade do produto a adicionar no estoque: ");
        int quantity = teclado.nextInt();
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
