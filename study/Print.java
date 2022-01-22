package br.com.jorge.study;

/**
 *
 * @author home
 */
public class Print {
    public String printNome(String nome) {
        if (nome.equals("jeriam")) {
            return "Jeriam mora em balneário";
        }else if (nome.equals("jorge")) {
            return "Jorge mora em Camboriu";
        }else if (nome.equals("Jaque")) {
            return "Jaque mora em Camboriu";
        }else{
            return "nao sei de quem vc esta falando";
        }
    }
}
