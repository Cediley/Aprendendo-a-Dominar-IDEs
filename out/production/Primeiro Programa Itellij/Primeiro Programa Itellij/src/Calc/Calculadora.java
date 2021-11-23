package Calc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o Primeiro Valor:");
        a = scan.nextInt();
        System.out.println("Digite o Segundo Valor:");
        b = scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        int multiplicacao = multiplicacao(a,b);
        int divisao = divisao(a,b);

        System.out.println("Ao Somar Teremos:" + soma);
        System.out.println("Ao Subtrair Teremos:" + subtracao);
        System.out.println("Ao Multiplicar Teremos:" + multiplicacao);
        System.out.println("Ao Dividir Teremos:" + divisao);

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

}
