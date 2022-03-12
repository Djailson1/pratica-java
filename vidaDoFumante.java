package br.com.java;
import java.util.Scanner;

/*Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/

public class vidaDoFumante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cigarrosPorDia;
        int anosFumando;
        int diasPerdidosDeVida;
        int dias;
        int minutosDia;
        int totalCigarros;

        System.out.println("Qual a quantidade de cigarros fumados por dia? ");
        cigarrosPorDia = scan.nextInt();

        System.out.println("Há quantos anos você fuma? ");
        anosFumando = scan.nextInt();


        //conversões
        dias = anosFumando * 365;


        //total de cigarros e dias de vida a menos
        totalCigarros = cigarrosPorDia * dias;
        minutosDia = dias * 1440;
        diasPerdidosDeVida = (totalCigarros * 10) / 1440;

        System.out.println("Estima-se que você perdeu " + diasPerdidosDeVida + " dias de vida.");




    }
}
