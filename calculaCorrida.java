package br.com;

import java.util.Scanner;

/*Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.*/
public class calculaCorrida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double km;
        double precoPassagem;

        System.out.println("Qual a distância da viagem em km? ");
        km = scan.nextDouble();

        if (km <= 200) {
            km = km * 0.50;
        }else{
            km = km * 0.45;
        }

        System.out.println("O preço da passagem é de " + km + " reais.");


    }
}
