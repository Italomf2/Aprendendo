package Exercicios_logicProg;
import java.util.Scanner;

//5) Leia e apresente um número inteiro.

public class Exerc05 {

        public static void main (String[] args){

            Scanner numero = new Scanner (System.in);
            float n;
            float teste;

            System.out.println("Digite um número inteiro");
            n = (float) numero.nextDouble();

            teste = (n %1);

            if (teste == 0) {

                System.out.printf("o numero inteior digitado é: = %.0f ", n);
            }
            else {

                System.out.println("o numero não é inteiro");

            }


        }

}
