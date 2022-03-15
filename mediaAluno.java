package br.com;

import java.util.Scanner;

/*Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).*/
public class mediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeDoAluno;
        double nota1;
        double nota2;
        double media;

        System.out.println("Insira o nome do Aluno: ");
        nomeDoAluno = scan.nextLine();

        System.out.println("Insira a Primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Insira a Segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;


        if (media >= 7){
            System.out.println("Você teve um bom aproveitamento!!");
        }
        else{
            System.out.println("Você Não teve um bom aproveitamento");
        }

    }
}
