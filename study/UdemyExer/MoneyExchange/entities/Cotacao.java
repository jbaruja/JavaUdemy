
package br.com.jorge.study.UdemyExer.MoneyExchange.entities;

/**
 *
 * @author home
 */
public class Cotacao {
    public static final double IOF = 0.06;
    
    public static double vdollar;
    public static double saledollar;
    
    public static double cotai(){
        return vdollar * saledollar + ((vdollar * saledollar) * IOF);
    }
    
    
}
