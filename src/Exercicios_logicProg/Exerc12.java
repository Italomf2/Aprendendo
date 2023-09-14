//12)Entrar com dois números reais e imprimir a média aritmética com a mensagem “Média” antes do resultado.

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args){

        float a,b,media;
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite um numero real");
        a = ler.nextFloat();

        System.out.println("Digite outro numero real");
        b = ler.nextFloat();

        media = (a+b)/2;

        System.out.println("A média é: "+ media);



    }



}
