//8) Receba nome, endereço e telefone e apresente-os.

package Exercicios_logicProg;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args){

        Scanner ler = new Scanner (System.in);
        String nome, ende, tel;


        System.out.println("Digite o seu nome, por favor");
        nome = ler.nextLine();

        System.out.println("Digite seu endereço, please ");
        ende = ler.nextLine();

        System.out.println("Digite seu numero de telefone");
        tel = ler.nextLine();

        System.out.println("o seu nome é: "+nome + " Você mora em: "+ende + " e seu numero de telefone é: "+tel);



    }


}
