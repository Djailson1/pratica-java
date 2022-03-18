package br.com;

import java.util.Scanner;

/*[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.*/
public class triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c;


        System.out.println("Insira o comprimento da primeira reta: ");
        a = scan.nextDouble();

        System.out.println("Insira o comprimento da segunda reta: ");
        b = scan.nextDouble();

        System.out.println("Insira o comprimento da terceira reta: ");
        c = scan.nextDouble();

        if((a < (b+c)) & (b < (a+c)) & (c < (a+b))) {
            System.out.println("È um triângulo! ");
        }else{
            System.out.println("Não é um triângulo!");
        }

    }
}
