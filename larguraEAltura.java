package br.com.java;

import java.util.Scanner;

/*Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

public class larguraEAltura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //sinalizando entrada de dados pelo teclado.

        double largura = 0;
        double altura = 0;
        double area = 0;
        double quantTinta = 0;
        //variáveis

        System.out.println("Qual é a altura e a largura da sua parede? ");//pedindo largura e altura ao usuário.

        System.out.println("Largura: ");
        largura = scan.nextDouble();//entrada do usuário com o valor da largura.

        System.out.println("Altura: ");
        altura = scan.nextDouble();//entrada do usuário com o valor da altura.

        area = altura * largura;//calculo da área a ser pintada.essa é a metragem quadrada da parede.
        quantTinta = area / 2;//calculo da quantidade de tinta a ser usada. com a área que foi calculada com a área dividida por 2 porque esse é o valor que um balde de tinta completo consegue pintar em 2 metros quadrados.

        System.out.println("A área de paredes " + area + " Metros quadrados.");//mostra a área a ser pintada.
        System.out.println("Quantidade de tinta necessária para a pintura: " + quantTinta + " Litros.");//mostra a quantidade de tintas a ser usada.




    }
}
