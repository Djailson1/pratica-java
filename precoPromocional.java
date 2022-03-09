package br.com.java;
import java.util.Scanner;

/*Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/


public class precoPromocional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoProduto = 0;
        double precoPromocao = 0;

        System.out.println("Qual é o preço do produto? ");
        precoProduto = scan.nextDouble();

        precoPromocao = (precoProduto * 0.05) - (precoProduto) ;

        System.out.println("O preço com desconto de 5% é: " + precoPromocao + " reais.");

    }
}
