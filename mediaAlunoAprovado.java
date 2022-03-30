package br.com;

import java.util.Scanner;

/*Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO*/
public class mediaAlunoAprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Insira a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Insira a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua média foi de: " + media);


        if((media < 7) && (media >= 5 ) ){

            System.out.println("RECUPERAÇÃO.");

        }else if(media < 5){

            System.out.println("REPROVADO.");

        }else if(media >= 7){

            System.out.println("APROVADO!!");

        }

    }
}
