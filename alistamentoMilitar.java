package br.com;

import java.util.Scanner;

/*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.*/
public class alistamentoMilitar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoNascimento;
        int anoAtual = 2022;
        int idade;

        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println("Quem nasceu em " + anoNascimento + ", tem " + idade + " anos, no ano de " + anoAtual + "." );

        if (idade < 18) {

            System.out.println("Você irá se alistar em " + (18 - idade) + " ano(s)");
            System.out.println("Você irá se alistar no ano de " + (anoAtual + (18 - idade)));
        
        }else if(idade == 18) {

            System.out.println(" Você irá se alistar esse ano de " + anoAtual);
        
        }else if (idade > 18) {

            System.out.println("Já se passaram " + (idade - 18) + " Ano(s). Procure o alistamento imediatamente!");

        }






    }
}
