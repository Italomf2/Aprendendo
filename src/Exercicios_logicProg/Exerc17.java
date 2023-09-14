/*17)Em com um número e apresentar a seguinte saída:
Número:
Quadrado:
Raiz quadrada: */

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);

        int a;
        double quadrado,raiz;


        System.out.println("Digite o numero ");
        a = ler.nextInt();

        raiz = Math.sqrt(a);
        quadrado = (a * a);

        System.out.println("O valor digitado é: "+ a);

        System.out.println("O valor do quadrado do numero é: "+ quadrado);

        System.out.printf("O valor da raiz quadrada do numero digitado é: %.2f ", raiz);



    }


}


