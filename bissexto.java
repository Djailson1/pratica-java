package br.com;

import java.util.Scanner;

/*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.*/
public class bissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano: ");
        ano = scan.nextInt();

       if(ano % 400 == 0){

           System.out.println(ano + " é bissexto!!");

        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {

           System.out.println(ano + " é bissexto!!");

        }else{

            System.out.println(ano + " não é bissexto!!");
        }


    }
}
