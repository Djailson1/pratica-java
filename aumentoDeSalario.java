package br.com.java;

import java.util.Scanner;

/*Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/
public class aumentoDeSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioFuncionario;
        double salarioComAumento;

        System.out.println("Digite o salário do funcionário: ");
        salarioFuncionario = scan.nextDouble();

        salarioComAumento = (salarioFuncionario * 0.10) + (salarioFuncionario);
        System.out.println(salarioComAumento);


    }
}
