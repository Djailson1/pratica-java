package br.com.java;

import java.util.Scanner;

/*Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/
public class segundoGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;//as variáveis a,b,c serão informado pelo usuário.
        int delta;
        int x1;
        int x2;
        // as variáveis delta, x1 e x2 são para calculos.

        System.out.println("Informe os valores de a,b,c: ");

        System.out.println("Informe o Valor de A: ");
        a = scan.nextInt();

        System.out.println("Informe o valor de B: ");
        b = scan.nextInt();

        System.out.println("Informe o valor de C: ");
        c = scan.nextInt();

        delta = b ^ 2 - 4 * a * c;// convertendo o valor de Delta

        if(delta > 0){
          x1 = (-b + delta ^ (1/2)) / (2 * a);
          x2 = (-b - delta ^ (1/2)) / (2 * a);
            System.out.println("A equação possui dus raizes reais.");
            System.out.println("X 1 = " + x1 + " e X 2 = " + x2);
            //condição 1 caso for MAIOR que ZERO
        }else if(delta == 0){
            x1 = -b / (2 * a);
            System.out.println("A equação possui uma raiz real.");
            System.out.println("X1 = " + x1);
            //condição 2 caso for IGUAL  a ZERO.
        }else{
            System.out.println("A equação não possui raizes reais.");
            // caso não for MAIOR ou IGUAL a ZERO será negativo e sem raizes reais.
        }








    }
}

