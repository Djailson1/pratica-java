package br.com.java;
import java.util.Scanner;

/*Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm*/


public class medidasDistancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //sinalizando entrada de dados pelo teclado.

        float metros = 0;
        float km = 0;//Quilômetro
        float hm = 0;//Hectômetro
        float dam = 0;//Decâmetro
        float dm = 0;//Decímetro
        float cm = 0;//Centímetros
        float mm = 0;//Milímetro
        //variáveis

        System.out.println("Digite um distância em metros: ");// pedindo o valor da distância ao usuário.
        metros = scan.nextFloat(); //armazenando o valor informado pelo usuário na variável metros.

        km = metros / 1000;
        hm = metros / 100;
        dam = metros / 10;
        dm = metros * 10;
        cm = metros * 100;
        mm = metros * 1000;
        //medidas convertidas relativos em outras medidas.

        System.out.println("A distância de " + metros + " Corresponde a: ");

        System.out.println(km + " Km");
        System.out.println(hm + " Hm");
        System.out.println(dam + " Dam");
        System.out.println(dm + " Dm");
        System.out.println(cm + " Cm");
        System.out.println(mm + " Mm");
        //imprimindo medidas convertidas na tela.



    }
}
