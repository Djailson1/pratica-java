package br.com;

/*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km*/

import java.util.Scanner;

public class aluguelModeloCarro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tipo;
        double km, dias,total;

        System.out.println("Qual o tipo de carro alugado?");
        tipo = in.nextLine();

        System.out.println("Quantas diárias a cobrar?");
        dias = in.nextInt();

        System.out.println("Quantos quilometros foram percorridos?");
        km = in.nextFloat();





        if(tipo.equals("popular") && (km < 100)) {
            dias = dias * 90;
            km = km * 0.20;
            total = dias + km;
            System.out.println("O valor total do aluguel foi de R$" + total + " reais.");


        } else if(tipo.equals("popular") && (km >= 100)) {

            dias = dias * 90;
            km = km * 0.10;
            total = dias + km;
            System.out.println("O valor total do aluguel foi de R$" + total + " reais.");
        }

        if(tipo.equals("luxo") && (km < 200)) {
            dias = dias * 150;
            km = km * 0.30;
            total = dias + km;
            System.out.println("O valor total do aluguel foi de R$" + total + " reais.");


        } else if(tipo.equals("luxo") && (km >= 200)) {

            dias = dias * 150;
            km = km * 0.25;
            total = dias + km;
            System.out.println("O valor total do aluguel foi de R$" + total + " reais.");

        }

    }
}
