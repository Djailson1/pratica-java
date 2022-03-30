package br.com;

import java.util.Scanner;

/*Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%*/
public class reajusteSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeFuncionario;
        double salarioFuncionario;
        double anosTrabalhando;

        System.out.println("Digite o nome do funcionário: ");
        nomeFuncionario = scan.nextLine();

        System.out.println("Informe o salário do funcionário: ");
        salarioFuncionario = scan.nextDouble();

        System.out.println("Informe quantos anos trabalha na empresa: ");
        anosTrabalhando = scan.nextDouble();

        if(anosTrabalhando < 3) {

           salarioFuncionario = (salarioFuncionario * 0.03) + salarioFuncionario;

        } else if((anosTrabalhando >= 3) && (anosTrabalhando < 10)) {

           salarioFuncionario = (salarioFuncionario * 0.125) + salarioFuncionario;

        } else if(anosTrabalhando >= 10) {

            salarioFuncionario = (salarioFuncionario * 0.20) + salarioFuncionario;

        }
        System.out.println(" o funcionário " + nomeFuncionario + ", trabalha a " + anosTrabalhando + " anos e seu salário ajustado terá um valor de " + salarioFuncionario + " reais.");
    }
}
