package br.com.java;

/*Crie um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela.
* Ex:
* Qual é seu nome?
* -João José
* -Olá, João José é um prazer te conhecer!*/
import java.util.Scanner;

public class boasVindas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        System.out.println("Qual é o seu nome?");//pedindo o nome do usuário.
        String nome = scan.next();//ler a entrada do usuário e armazena o valor tipo string na variável.

        System.out.println("Olá " + nome + ", é um prazer te conhecer!!" );//imprime o nome do usuário e uma mensagem para ele.
    }
}
