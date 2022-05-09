package br.com.java.exercicios;

import java.util.Scanner;

/*21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.*/
public class exercicio_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//armazenando informação do usuário na variável

        int ano;//variável

        System.out.println("Digite o ano: ");
        ano = scan.nextInt();//armazenando informação do usuário na variável

        if(ano % 400 == 0){

            System.out.println(ano + " é bissexto!!");

        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {

            System.out.println(ano + " é bissexto!!");

        }else{

            System.out.println(ano + " não é bissexto!!");
        }
        //condições para concluir se um ano é bissexto ou não.

    }
}
