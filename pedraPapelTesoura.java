package br.com;
import java.util.Scanner;

/*Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/

public class pedraPapelTesoura{
    public static void main (String args []){

            Scanner scan = new Scanner(System.in);
            int jogador1,jogador2;

            System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
            System.out.println("Pedra = 0 ");
            System.out.println("Papel = 1 ");
            System.out.println("Tesoura = 2 ");

            System.out.println("Jogador 1: ");
            jogador1 = scan.nextInt();

            System.out.println("Jogador 2: ");
            jogador2 = scan.nextInt();

            switch (jogador1) {
                case 0:
                    switch (jogador2) {
                        case 0:
                            System.out.println("Empate");
                            break;
                        case 1:
                            System.out.println("Jogador 2 ganhou");
                            break;
                        case 2:
                            System.out.println("Jogador 1 ganhou");
                            break;
                        default:
                            System.out.println("Insira um número válido!");
                    }
                    break;
                case 1:
                    switch (jogador2) {
                        case 0:
                            System.out.println("Jogador 1 ganhou");
                            break;
                        case 1:
                            System.out.println(" Empatou");
                            break;
                        case 2:
                            System.out.println("Jogador 2 ganhou");
                            break;
                        default:
                            System.out.println("Insira um número válido!");
                    }
                    break;
                case 2:
                    switch (jogador2) {
                        case 0:
                            System.out.println("Jogador 2 ganhou");
                            break;
                        case 1:
                            System.out.println("Jogador 1 ganhou");
                            break;
                        case 2:
                            System.out.println("Empate");
                            break;
                        default:
                            System.out.println("Insira um número válido!");
                    }
                    break;
                default:
                    System.out.println("Insira um número válido!");
            }

    }
}
