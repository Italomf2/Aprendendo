/*13)Entrar com dois números inteiros e imprimir a seguinte saída:
• Dividendo:
• Divisor:
• Quociente:
• Resto:
*/

package Exercicios_logicProg;
import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args){

        int a,b,quo,resto;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dividendo em numero inteiro");
        a = ler.nextInt();

        System.out.println("Digite o divisor em numero inteiro");
        b = ler.nextInt();

        quo = (a / b);
        resto = (a % b);

        System.out.println("O dividendo é: "+ a);
        System.out.println("O divisor é: "+ b);
        System.out.println("O quociente é: "+ quo);
        System.out.println("O resto é: "+ resto);


    }


}
