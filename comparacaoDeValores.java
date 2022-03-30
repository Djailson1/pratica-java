package br.com;

import java.util.Scanner;

/*Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais*/
public class comparacaoDeValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Insira o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.println("Insira o segundo valor: ");
        valor2 = scan.nextInt();

        if(valor1 > valor2) {

            System.out.println("O primeiro número é o maior.");

        }else if(valor2 > valor1) {

            System.out.println("O segundo número é o maior.");

        }else{

            System.out.println("Não existe valor maior, os dois são iguais");

        }
    }
}
