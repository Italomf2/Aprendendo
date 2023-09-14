//14)Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args){

        float a,b,c,d;
        float mediaP;

        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o primeiro numero que terá peso 1");
        a = ler.nextFloat();

        System.out.println("Digite o segundo numero que terá peso 2");
        b = ler.nextFloat();

        System.out.println("Digite o terceiro numero que terá peso 3");
        c = ler.nextFloat();

        System.out.println("Digite o quarto numero que terá peso 4");
        d = ler.nextFloat();

        mediaP = (a + (b * 2) + (c * 3) + (d * 4))/4;

        System.out.println("a média Ponderada é: "+mediaP);

    }


}
