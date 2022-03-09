package br.com.java;
import java.util.Scanner;

/*Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$5,06.*/

public class comprarDolares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// sinalizando entrada de dados pelo teclado.

        double dinheiro = 0;
        double dolares = 0;
        //variáveis

        System.out.println("Quanto dinheiro em reais você tem na carteira? ");//Perguntando o valor disponíveis em reais na carteira do usuário.
        dinheiro = scan.nextDouble();//armazenando o valor informado pelo usuário na variável dinheiro.

        dolares = dinheiro / 5.06;//Convertendo reais em dólares

        System.out.println(" Você pode comprar " + dolares + " dólares americano.");//imprimindo a conversão na tela.


    }
}
