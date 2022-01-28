
package br.com.jorge.study.UdemyExer.Rectangulo.entities;

/**
 *
 * @author home
 */
public class Rectangulo {
    public double largura;
    public double altura;
    
    public double area(){
        return largura * altura;
    }
    
    public double perimetro(){
        return 2 * (largura + altura);
    }
    
    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    public String toString(){
        return "AREA = "
                + String.format("%.2f%n", area())
                + "PERIMETRO = "
                + String.format("%.2f%n", perimetro())
                + "DIAGONAL = "
                + String.format("%.2f%n", diagonal());
    }
}
