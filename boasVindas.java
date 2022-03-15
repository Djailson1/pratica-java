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

    public static class execessoDeVelocidade {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double velocidade;
            double multa;
            double excessoDeVelocidade;

            System.out.println("Qual é a velocidade do carro? ");
            velocidade = scan.nextDouble();

            if (velocidade > 80) {
               excessoDeVelocidade = velocidade - 80;
               multa = excessoDeVelocidade * 5;
                System.out.println("Você foi multado em R$" + multa);
            }else{
                System.out.println("Continue dirigindo com cuidado!");
            }
        }
    }
}
