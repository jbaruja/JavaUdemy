package br.com.jorge.DevTo.AlturaMedia;

import java.util.Scanner;

/**
 * https://dev.to/guilhermemanzano/lista-de-exercicios-basicos-em-java-parte-1-5f0l
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
 * de 10 pessoas. Fazer um algoritmo que calcule e escreva: a. a maior e a menor
 * altura do grupo; b. média de altura dos homens; c. o número de mulheres. É
 * preciso levantar o total de homens e mulheres 
 *
 * @author home
 */
public class AlturaMedia {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int sexo, qtMulheres = 0, qtHomens = 0, vagas=0;
        float altura, somaH = 0, mediaHomens = 0, maior=0, menor = 0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o número de participantes");
            vagas = teclado.nextInt();
            for(int i=0; i< vagas; i++){
                System.out.println("Escolha o sexo da pessoa (1-Mulher, 2-Homem)");
                sexo = teclado.nextInt();
                System.out.println("Digite a altura: ");
                altura = teclado.nextFloat();
                if(sexo == 1){
                    qtMulheres++;
                } else if(sexo == 2){
                    qtHomens++;
                    somaH = somaH + altura;
                } else {
                    System.out.println("Opção sexo inválido");
                }
                if (altura > maior) {
                    maior = altura;
                }else if(altura < menor){
                    menor = altura;
                }
            }
            mediaHomens = somaH / qtHomens;
            System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de "+ menor + "m." );
            System.out.println("A média de altura dos homens é" + mediaHomens + "m");
            System.out.println("O número de mulheres é "+ qtMulheres);
        }
    }
}
