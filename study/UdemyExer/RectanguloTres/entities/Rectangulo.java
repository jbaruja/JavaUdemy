
package br.com.jorge.study.UdemyExer.RectanguloTres.entities;

/**
 *
 * @author home
 */
public class Rectangulo {
    public double altura;
    public double largura;
    
    public double area(){
        return altura * largura;
    }
    
    public double perimetro(){
        return 2 * (altura + largura);
    }
    
    public double diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }
    
    public String toString() {
        return "AREA = "
                + String.format("%.2f%n", area())
                +"PERIMETRO = "
                + String.format("%.2f%n", perimetro())
                + "DIAGONAL = "
                + String.format("%.2f%n", diagonal());
    }
    
}
