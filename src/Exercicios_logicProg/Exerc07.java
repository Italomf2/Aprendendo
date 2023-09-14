//7) Receba um número inteiro e apresente seu sucessor e seu antecessor.

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args){

        int n,ant,suc;

        Scanner ler = new Scanner (System.in);

        System.out.println("Digite um numero inteiro");
        n = ler.nextInt();

        ant = n - 1;
        suc = n + 1;

        System.out.println("O antecessor do numero digitado é "+ant + " e o sucessor é "+suc);


    }


}
