package br.com;

import java.util.Scanner;

/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto*/
public class desconto_homens_mulheres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int opcao;
        double masculino;
        double feminino;
        double valor;

        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();

        System.out.println("Informe o valor da compra: ");
        valor = scan.nextDouble();

        masculino = valor - (valor * 0.05 );
        feminino = valor - (valor * 0.13);

        System.out.println("Escolha a opção que corresponde ao seu sexo: ");
        System.out.println("Número (1) Masculino");
        System.out.println("Número (2) Feminino");

        opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("O valor da sua compra é " + masculino + " reais.");
                break;

            case 2:
                System.out.println("O valor da sua compra é " + feminino + " reais.");
               break;
            default:
                System.out.println("Insira um valor válido!! ( 1 ou 2).");

        }








    }
}
