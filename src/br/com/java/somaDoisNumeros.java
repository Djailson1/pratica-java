package br.com.java;

/*Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/

import java.util.Scanner;

public class somaDoisNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        int primeiroNumero;
        int segundoNumero;
        //variáveis

        System.out.println("Digite um valor: ");//pedindo ao usuário um valor.
        primeiroNumero = scan.nextInt();//recebendo o valor informado pelo usuário e armazenando na variável primeiroNumero.

        System.out.println("Digite outro valor: ");//pedindo ao usuário um valor.
        segundoNumero = scan.nextInt();//recebendo o valor informado pelo usuário e armazenando na variável segundoNumero.

        System.out.println("A soma entre " + primeiroNumero + " e " + segundoNumero + " igual a " + (primeiroNumero + segundoNumero) + ".");//imprime na tela os valores informados pelo usuário e por fim soma mostrando tudo na tela.
    }
}
