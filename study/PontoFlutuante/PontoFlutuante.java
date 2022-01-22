package br.com.jorge.study.PontoFlutuante;

import java.util.Locale;



/**
 * Escrever o conteúdo de uma variável com ponto flutuante 
 * regular as casas decimais para 2
 * somar uma variavel int a uma double regulando as casas decimais
 * Combinar/concatenar com textos
 * printf imprime no formato do PC, resolver isso com Locale
 * concatenar com $f  (regra geral para printf
 * @author home
 */
public class PontoFlutuante {

    public static void main(String[] args) {
        int y = 51;
        double x = 10.35784;
        
        System.out.print("O cliente investiu " + y);
        System.out.println(" e teve um rendimento de " + x + " no periodo de 6 meses.");
        System.out.printf("Saldo do cliente " + "%.2f%n", x + y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        System.out.printf("O cliente investiu %d e teve %.4f de lucro no periodo de 6 meses. %n Atualizando o saldo para %.2f\n", y, x, x + y);
    }
}

/* **primeiro resultado**
51
10.35784
------------------------------------------------------------------------
BUILD SUCCESS

para regular as casas decimais utilizar
.printf("%.2f%n", x);  <-- para 2 decimais

%.2f são as casas decimais
%n é a quebra de linha que também pode ser \n

** segundo resultado**
--- exec-maven-plugin:3.0.0:exec (default-cli) @ study ---
51
10.35784
10,36
------------------------------------------------------------------------
BUILD SUCCESS

** terceiro resultado **
--- exec-maven-plugin:3.0.0:exec (default-cli) @ study ---
51
61,36
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.001 s

** quarto resultado **
--- exec-maven-plugin:3.0.0:exec (default-cli) @ study ---
O cliente investiu510 e teve um rendimento de10.35784no periodo de 6 meses
Saldo do cliente520,36
------------------------------------------------------------------------
BUILD SUCCESS
Total time:  0.940 s

faltou ajustar os espaçamentos


*/

