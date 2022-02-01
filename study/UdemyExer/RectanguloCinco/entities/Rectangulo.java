
package br.com.jorge.study.UdemyExer.RectanguloCinco.entities;

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
        return Math.sqrt(altura * altura + largura * largura);
    }
    
    public String toString(){
        return "AREA = "
                + area()
                + "PERIMETRO = "
                + perimetro()
                + "DIAGONAL = "
                + diagonal();
    }
    
}
