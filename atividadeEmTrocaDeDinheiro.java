package br.com;

/*Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.*/

import java.util.Scanner;

public class atividadeEmTrocaDeDinheiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double horas, pontos, dinheiro;

        System.out.println("Quantas horas de atividade por mês? ");
        horas = scan.nextDouble();

        pontos = 0.05;

        if (horas < 10) {

            System.out.printf("Fez " + (horas * 2) + " pontos");

            dinheiro = (horas * 2) * pontos;

            System.out.printf(" e R$" + dinheiro + " em dinheiro." );

        }else if((horas >= 10) && (horas < 20)) {

            System.out.printf("Fez " + (horas * 5) + " pontos");

            dinheiro = (horas * 5) * pontos;

            System.out.printf(" e R$" + dinheiro + " em dinheiro." );

        } else if(horas >= 20) {

            System.out.printf("Fez " + (horas * 10) + " pontos");

            dinheiro = (horas * 10) * pontos;

            System.out.printf(" e R$" + dinheiro + " em dinheiro." );

        }

    }
}
