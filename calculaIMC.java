package br.com;

import java.util.Scanner;

/*O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura)*/
public class calculaIMC {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        String nome;
        double altura, peso, calculoIMC;

        System.out.println("Insira o nome: ");
        nome = scan.nextLine();

        System.out.println("Insira a altura: ");
        altura = scan.nextDouble();

        System.out.println("Insira o peso: ");
        peso = scan.nextDouble();

        calculoIMC = peso / (altura * altura);

        System.out.println(nome + " seu IMC é de: " + calculoIMC);

        if (calculoIMC < 18.5) {

            System.out.println("Você está abaixo do peso.");

        }else if((calculoIMC >= 18.5) && (calculoIMC < 25)) {

            System.out.println("Você está no peso ideal!");

        }else if ((calculoIMC >= 25) && (calculoIMC < 30)) {

            System.out.println("Você está acima do peso.");

        }else if ((calculoIMC >= 30) && (calculoIMC < 40)) {

            System.out.println("Você está com obesidade.");

        }else if (calculoIMC >= 40) {

            System.out.println("Você está com obesidade mórbida.");

        }


    }
}
