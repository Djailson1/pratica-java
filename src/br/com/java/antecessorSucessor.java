package br.com.java;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

public class antecessorSucessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        int numero = 0;
        int antecessor = 0;
        int sucessor = 0;
        //variáveis

        System.out.println("Digite um número: ");//pedindo o número ao usuário.
        numero = scan.nextInt();//ler a entrada do usuário e armazena o valor em uma variável.

        antecessor = numero - 1;//subtrai 1 do valor que o usuário informar e armazena na variável antecessor.
        sucessor = numero + 1;//soma 1 do valor que o usuário informar e armazena na variável sucessor.

        System.out.println("O antecessor de " + numero + " é " + antecessor);//imprime o antecessor na tela.
        System.out.println("O sucessor de " + numero + " é " + sucessor);//imprime o sucessor na tela.



    }
}
