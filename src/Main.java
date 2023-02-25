import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o Segundo valor valor: ");
        b = scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multiplicacao = multiplicacao(a,b);
        double divisao = divisao(a,b);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);


    }

    public static int  soma(int a, int b) {
        return a + b;
    }

    public static int  subtracao (int a, int b) {
        return a - b;
    }

     public static int  multiplicacao (int a, int b) {
        return a * b;
    }

    public static double  divisao (double a, double b) {
        return a / b;
    }

}