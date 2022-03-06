package br.com.java;
/*Crie um programa que leia o nome e o salário de funcionário mostrando no final um mensagem:
*
* Nome do funcionário:  Maria do Carmo.
* Salário: 1,214.00
* O funcionário Maria do carmo tem um salário de 1.214,00 reais, em junho.*/

import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        String funcionario;
        float salario;
        //variáveis

        System.out.println("Qual o nome do funcionário?");//pedindo o nome do funcionário.
        funcionario = scan.next();//ler a entrada do usuário e armazena o valor tipo string na variável funcionário.

        System.out.println("Qual é o salário do funcionário?");//pedindo o valor do salário do usuário.
        salario = scan.nextFloat();//ler a entrada do usuário e armazena o valor do salário na variável salario.

        System.out.println("O funcionário " + funcionario + ", tem um salário de " + salario + " reais, em dezembro.");//imprime na tela o nome do funcionário e o seu salário.

    }
}
