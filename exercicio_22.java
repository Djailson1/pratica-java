package br.com.java.exercicios;

import java.util.Scanner;

/*22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.*/
public class exercicio_22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//armazenando informação do usuário na variável

        int anoNascimento;
        int anoAtual = 2022;
        int idade;
        //variáveis

        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = scan.nextInt();//armazenando informação do usuário na variável

        idade = anoAtual - anoNascimento;//calculo pra saber idade

        System.out.println("Quem nasceu em " + anoNascimento + ", tem " + idade + " anos, no ano de " + anoAtual + "." );

        if (idade < 18) {//codições para alistamento

            System.out.println("Você irá se alistar em " + (18 - idade) + " ano(s)");
            System.out.println("Você irá se alistar no ano de " + (anoAtual + (18 - idade)));

        }else if(idade == 18) {

            System.out.println(" Você irá se alistar esse ano de " + anoAtual);

        }else if (idade > 18) {

            System.out.println("Já se passaram " + (idade - 18) + " Ano(s). Procure o alistamento imediatamente!");

        }

    }
}
