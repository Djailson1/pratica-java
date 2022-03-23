package br.com;

/*Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.*/

import java.util.Scanner;

public class emprestimoBancario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorCasa;
        double salarioComprador;
        double anosPagamento;
        double meses;
        double prestacao;

        System.out.println("Insira o valor da casa a ser comprada: ");
        valorCasa = scan.nextDouble();

        System.out.println(" Qual é o seu salário mensal? ");
        salarioComprador = scan.nextDouble();

        System.out.println(" Em quantos anos deseja pagar? ");
        anosPagamento = scan.nextDouble();

        meses = anosPagamento * 12;
        prestacao = valorCasa / meses;

        if (prestacao > salarioComprador * 0.30) {
            System.out.println("Infelizmente o empréstimo foi negado.");
        }else{
            System.out.println("O empréstimo com prestação de R$ " + prestacao + " foi aceito!!");
        }


    }
}
