package br.com;

import java.util.Scanner;

/*Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes*/
public class variosTiposDeTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c;


        System.out.println("Insira o comprimento da primeira reta: ");
        a = scan.nextDouble();

        System.out.println("Insira o comprimento da segunda reta: ");
        b = scan.nextDouble();

        System.out.println("Insira o comprimento da terceira reta: ");
        c = scan.nextDouble();

        if((a < (b + c)) & (b < (a + c)) & (c < (a + b))) {

            System.out.println("È um triângulo! ");

        }if((a == b) && (b == c)){

            System.out.println("Equilátero!");

        }else if((a == b) || (b == c) || (c == a)) {

            System.out.println("Isósceles!");


        }else if((a != b) || (b != c) || (c != a)) {

            System.out.println("Escaleno");
        }
        else{
            System.out.println("Os segmentos acima não podem formar triângulo");
        }
    }
}
