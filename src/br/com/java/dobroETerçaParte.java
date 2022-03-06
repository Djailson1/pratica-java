package br.com.java;
import java.util.Scanner;

/*Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
        sua terça parte.
        Ex:
        Digite um número: 3.5
        O dobro de 3.5 é 7.0
        A terça parte de 3.5 é 1.16666*/


public class dobroETerçaParte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        float numero = 0;
        float dobro = 0;
        float tercaParte = 0;
        //variáveis

        System.out.println("Digite um número: ");//pedindo um número ao usuário.
        numero = scan.nextFloat();//ler a entrada do usuário e armazena o valor em uma variável.

        dobro = numero * 2;//multiplica por 2 o valor que o usuário informar e armazena na variável dobro.
        tercaParte = numero / 3;//divide por 3 o valor que o usuário informar e armazena na variável tercaParte.

        System.out.println("O dobro de " + numero + " é " + dobro);//imprime o dobro na tela.
        System.out.println("A terça parte de " + numero + " é " + tercaParte);//imprime a terça parte na tela.



    }
}
