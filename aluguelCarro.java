package br.com.java;

import java.util.Scanner;

/*A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/
public class aluguelCarro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantKm;
        double diasAlugado;
        double precoTotal;


        System.out.println("Informe a quantidade de quilômetros: ");
        quantKm = scan.nextDouble();

        System.out.println("Informe a quantidade de dias que o carro foi alugado: ");
        diasAlugado = scan.nextDouble();

        quantKm = quantKm * 0.20;
        diasAlugado = diasAlugado * 90.00;

        precoTotal = quantKm + diasAlugado;

        System.out.println("O total a receber pelo aluguel do carro: " + precoTotal + " reais.");
    }
}
