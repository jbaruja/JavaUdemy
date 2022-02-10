package br.com.jorge.study.UdemyExer.ListB.application;

import br.com.jorge.study.UdemyExer.ListB.entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionários irá registrar?");
        int N = teclado.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ": ");
            System.out.println("Id: ");
            teclado.nextLine();
            Integer id = teclado.nextInt();
            
            while (hasId(list, id)){
                System.out.println("O ID já existe, tente novamente.");
                id = teclado.nextInt();
            }
            
            System.out.println("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.println("Salario: ");
            Double salario = teclado.nextDouble();
            
            Funcionario emp = new Funcionario(id, nome, salario);
            
            list.add(emp);
            
        }
        System.out.println();
        System.out.println("Digite o ID do funcionario que terá um incremento: ");
        int idsalario = teclado.nextInt();
        
        Funcionario emp = list.stream().filter(x-> x.getId() == idsalario).findFirst().orElse(null);
        
        if( emp == null){
            System.out.println("Esse id não existe.");
        }
        else {
            System.out.println("Digite a porcentagem: ");
            double percent = teclado.nextDouble();
            emp.incremento(percent);
        }
        
        System.out.println();
        System.out.println("Lista de Funcionarios:");
        for(Funcionario e : list) {
            System.out.println(e);
        }
        
        
    }
    

    
    static boolean hasId(List<Funcionario> list, int id){
        Funcionario emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    
}
