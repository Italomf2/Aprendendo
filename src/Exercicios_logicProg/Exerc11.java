//11)Leia um número real e imprimir a terça parte deste número

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args){

        float a, b;

        Scanner ler = new Scanner (System.in);

        System.out.println("Digite um numero real");
        a = ler.nextFloat();

        b = a/3;

        System.out.printf("A terça parte do numero digitado é %.2f", b);



    }


}
