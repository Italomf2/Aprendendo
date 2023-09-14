package Exercicios_logicProg;
import java.util.Scanner;

//2) Apresente seu nome.


public class Exerc02 {

    public static void main (String[] args){

        Scanner nome = new Scanner (System.in);
        String n;

        System.out.println("Digite o seu nome completo, por favor");
        n = nome.nextLine();

        System.out.println("o seu nome é: "+ n);



    }



}
