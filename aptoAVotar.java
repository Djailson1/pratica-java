package br.com;

import java.util.Scanner;

/*Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.*/
public class aptoAVotar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoNascimento;
        int idade;

        System.out.println("Insira o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        idade = 2022 - anoNascimento;

        System.out.println("Você tem " + idade + " anos.");

       if (idade >= 16) {
           System.out.println("Poderá votar esse ano!!");
       }else{
           System.out.println("Você não tem a idade necessária para votar!!");
       }
    }
}
