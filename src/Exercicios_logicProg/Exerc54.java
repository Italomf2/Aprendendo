/*54) Calcule a quantidade de latas de tinta necessárias e o custo para pintar tanques
cilíndricos de combustíveis, em que são fornecidos a altura e o raio desse cilindro.
Sabendo que:
• A lata de tinta custa 50,00;
• Cada lata contém 5 litros;
• Cada litro de tinta pinta 3 metros quadrados.
Dados de entrada: altura (H) e raio (R).
Dados de saída: custo (C) e quantidade (QTDE).*/


package Exercicios_logicProg;
import java.util.Scanner;  /* Aqui eu importei a classe Scanner: esse comando permite eu utilizar
 o código da classe Scanner para minha aplicação, que no caso é pedir informações.*/


public class Exerc54 {

    public static void main(String[] args) {

        float area_base,area_lateral,area_cilindro,qtde_litros,qtde_latas,latas_arredondado;
        float custo;
        double piDouble = Math.PI;
        float piFloatCasting = (float) piDouble;


        Scanner entrada_1 = new Scanner(System.in);    /*  nomeei a classe Scanner de entrada_1. E o resto faz parte da estrutura. o (System.in) é oq permite usar o teclado para fzr a leitura da entrada*/
        float r;                                                   // declarei o tipo da minha variável.
        System.out.println("Digite o valor do raio em metros");  // aqui sai na tela a string que pedi pra sair uma linha abaixo (println)
        r = entrada_1.nextFloat();          // aqui ele pede guarda a minha entrada na variavel r.


        Scanner entrada_2 = new Scanner(System.in);
        float h;
        System.out.println("Digite o valor da altura em metros,por favor");
        h = entrada_2.nextFloat();

        entrada_2.close();


        area_base = piFloatCasting * ( r * r ) ;
        area_lateral = (h * (2 * piFloatCasting * r * h));
        area_cilindro = (area_base + area_lateral);
        qtde_litros = (area_cilindro/3);
        qtde_latas = (qtde_litros/5);
        custo = (qtde_latas * 50);
        latas_arredondado = (int)(qtde_latas + 1);

        System.out.printf("O custo é R$ %.2f", custo  );
        System.out.printf(" e a quantidade de latas são %.0f ", latas_arredondado );


    }


}
