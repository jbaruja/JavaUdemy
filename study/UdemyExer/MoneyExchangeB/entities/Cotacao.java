
package br.com.jorge.study.UdemyExer.MoneyExchangeB.entities;

/**
 *
 * @author home
 */
public class Cotacao {
    public static double IOF = 0.06;
    
    public static double vdollar;
    public static double qdollar;
    
    public static double trocai(){
        return vdollar * qdollar + ((vdollar * qdollar) * IOF );
    }
}

/** CORRECAO
 * package util;
public class CurrencyConverter {
public static double IOF = 0.06;
public static double dollarToReal(double amount, double dollarPrice) {
return amount * dollarPrice * (1.0 + IOF);
}
}
 */
