package br.com.java;

import java.util.Scanner;

/*Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.*/
public class diasTrabalhado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double diasTrabalhadoMes;
        double horasTrabalhadasPorDia = 8;
        double valorGanhoPorHoraTrabalhada = 25.00;

        System.out.println("Insira a quantidade de dias trabalhados no mês: ");
        diasTrabalhadoMes = scan.nextDouble();

        diasTrabalhadoMes = diasTrabalhadoMes * (horasTrabalhadasPorDia * valorGanhoPorHoraTrabalhada);



        System.out.println(" O salário do funcionário é de: " + diasTrabalhadoMes + " reais.");


    }
}
