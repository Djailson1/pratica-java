package br.com.java;
import java.util.Scanner;

/*Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/


public class mediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        double nota1;
        double nota2;
        double media;
        //variáveis

        System.out.println("Digite a primeira nota: ");//pedindo a nota 1 ao usuário.
        nota1 = scan.nextDouble();//ler o valor informado pelo usuário e armazena o valor na variável nota1.

        System.out.println("Digite a segunda nota: ");//pedindo a nota 2 ao usuário.
        nota2 = scan.nextDouble();//ler o valor informado pelo usuário e armazena o valor na variável nota2.

        media = (nota1 + nota2)/2;// primeiro soma as notas informada pelo usuário e depois divide por 2 obtendo a média e armazenando na variável.

        System.out.println(" A média entre " + nota1 + " e " + nota2 + " é igual a " + media);//imprime as notas informadas pelo usuário e a média na tela.





    }
}
