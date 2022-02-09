package br.com.jorge.study.UdemyExer.List.application;

import br.com.jorge.study.UdemyExer.List.entities.Employee;
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

        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionarios irá registrar? ");
        int N = teclado.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.println("Id: ");
            teclado.nextLine();
            Integer id = teclado.nextInt();
            
            while (hasId(list, id)){
                System.out.println("O ID já existe, tente novamente.");
                id = teclado.nextInt();
            }
            
            
            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Salary: ");
            Double salary = teclado.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }
        System.out.println();
        System.out.println("Digite o ID do funcionario que terá amento:");
        int idsalary = teclado.nextInt();
       
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        
        //Integer pos = position(list, idsalary);
        if (emp == null) {
            System.out.println("Esse id não existe.");
        } 
        else {
            System.out.println("Digite a porcentegem");
            double percent = teclado.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Employee e : list) {
            System.out.println(e);
        }

    }

    static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    
    static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
