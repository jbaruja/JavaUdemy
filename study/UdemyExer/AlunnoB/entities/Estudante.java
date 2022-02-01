
package br.com.jorge.study.UdemyExer.AlunnoB.entities;

/**
 *
 * @author home
 */
public class Estudante {
    public String nome;
    public double pTrim;
    public double sTrim;
    public double tTrim;
    
    public double notaFinal(){
        return pTrim + sTrim + tTrim;
    }
    
    public double falta(){
        if (notaFinal()<60){
            return 60 - notaFinal();
        }
        else{
            return 0.0;
        }
    }
}
