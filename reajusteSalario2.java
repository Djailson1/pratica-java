package br.com.java.exercicios;
import java.util.Scanner;

/*Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%*/

public class reajusteSalario {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String genero;
        double salarioAtual, anosTrabalhando, salarioReajustado;

        System.out.println("Qual é o sexo do funcionário? (homem ou mulher?)");
        genero = scan.nextLine() ;

        System.out.println("Qual é o salário atual? (*Usar ponto ao invés de vírgula)") ;
        salarioAtual = scan.nextDouble();

        System.out.println("Quantos anos trabalhando?") ;
        anosTrabalhando = scan.nextDouble();

        if((genero.equals("mulher")) && (anosTrabalhando < 15)) {

            salarioReajustado = (salarioAtual * 0.05) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");


        }else if((genero.equals("mulher")) && (anosTrabalhando >= 15) && (anosTrabalhando < 20)) {

            salarioReajustado = (salarioAtual * 0.12) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");

        } else if((genero.equals("mulher")) && (anosTrabalhando >= 20)) {

            salarioReajustado = (salarioAtual * 0.23) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");


        }
        if((genero.equals("homem")) && (anosTrabalhando < 20)) {

            salarioReajustado = (salarioAtual * 0.03) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");


        }else if((genero.equals("homem")) && (anosTrabalhando >= 20) && (anosTrabalhando < 30)) {

            salarioReajustado = (salarioAtual * 0.13) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");


        } else if((genero.equals("homem")) && (anosTrabalhando >= 30)) {

            salarioReajustado = (salarioAtual * 0.25) + salarioAtual;
            System.out.println("O salário com reajuste é de R$" + salarioReajustado + " reais.");


        }


    }
}

