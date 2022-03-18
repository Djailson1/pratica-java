package br.com;

import java.util.Scanner;

/*Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.*/
public class parOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int numero;

       System.out.println("Digite um número: ");
       numero = scan.nextInt();

       if (numero % 2 == 0) {
           System.out.println("È par!!");
       }else{
           System.out.println("È impar!!");
       }


    }
}
