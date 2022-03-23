package br.com;
import java.util.Random;
import java.util.Scanner;

/*Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.*/
public class sorteioNumero {
    public static void main(String[] args) {
        Random sort = new Random();
        Scanner scan = new Scanner(System.in);

        int numero;
        int numUsuario;

        numero = sort.nextInt(5);

        System.out.println("Digite um número para tentar acertar o sorteio: ");
        numUsuario = scan.nextInt();

        if(numUsuario == numero) {

            System.out.println("Você acertou!!");

        }else{

            System.out.println("Você errou!!");

        }


    }
}
