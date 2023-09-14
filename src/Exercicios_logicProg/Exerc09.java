//9) Receba dois números inteiros e apresente a soma. Antes de apresentar o resultado, deverá aparecer a mensagem: Soma.

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc09 {

        public static void main(String[] args){

            int a,b,c;

            Scanner ler = new Scanner (System.in);

            System.out.println("Digite o primeiro numero inteiro, por favor");
            a = ler.nextInt();

            System.out.println("Digite o segundo numero, por favor");
            b = ler.nextInt();

            c = (a + b);

            System.out.println("a soma é: "+ c);



        }


}


