/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
     v𝑜𝑙𝑢𝑚𝑒 = 3.14159 ∗ 𝑅²∗ 𝑎𝑙𝑡𝑢𝑟𝑎.*/


package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc37 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double raio, altura, volume;


        System.out.println("Digite o valor do raio");
        raio = ler.nextDouble();

        System.out.println("Digite o valor da altura");
        altura = ler.nextDouble();


        volume = 3.1415 * Math.pow(raio,2) * altura;

        System.out.printf("O valor do volume é %.2f", volume);

    }

}
