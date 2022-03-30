package br.com;

import java.util.Scanner;

/*Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP*/
public class terrenoLarguraEComprimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double largura;
        double comprimento;
        double metroQuadrado;

        System.out.println("Qual é a largura do terreno? ");
        largura = scan.nextDouble();

        System.out.println("Qual é o comprimento do terreno? ");
        comprimento = scan.nextDouble();

        metroQuadrado = largura * comprimento;

        System.out.println("O terreno tem " + metroQuadrado + " m².");

        if ((metroQuadrado >= 100) && (metroQuadrado < 500)) {

            System.out.println("TERRENO MASTER.");

        } else if (metroQuadrado < 100) {

            System.out.println("TERRENO POPULAR.");

        } else if (metroQuadrado >= 500) {

            System.out.println("TERRENO VIP.");

        }



    }
}
