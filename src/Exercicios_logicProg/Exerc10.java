//10)Receba dois números inteiros e apresente o seu produto.

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args){

        int a,b,c;


        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o primeiro numero inteiro, por favor");
        a = ler.nextInt();

        System.out.println("Digite o segundo numero inteiro");
        b = ler.nextInt();

        c = a * b;

        System.out.println("O produto entre os numeros digitados é: "+ c);


    }



}
