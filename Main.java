package com.company;
    /*
	Programa que receberá N qauntidades de numeros inteiros
	Calculará todos eles e mostrará a quantidade de numeros
	pares e impares
	 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros; //Variavel que representa a quantidade de vezes que o laço se repita
        int numero; //Variavel que recebe os numeros que serão avaliados e trabalhados no programa
        int par = 0; //Variavel que representa a quantidade de numeros pares
        int impar = 0; //Variavel que representa a quantidade de numeros impares

        System.out.println("Qauntidade de Numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) par++;
            // se a divisão po 2 do numero for igual a 0, add mais um valor a variavel 'par'
            else impar++;
            /* Se a divisão do numero não for igual a 0, add mais um valor a variavel impar
            Obs: exatamente por isso hambas as variaveis começam com valor 0
            por conta de no inicio do programa, ainda não temos nenhum valor na variavel 'numero'*/
    /*
    Quando entrar no loop 'Do', será pedido uma quantidade de numeros:
    Esses numeros serão avaliados e divididos individualmente
   "se"  divisão deste numero for igual a 0: nesse caso o numero será par
   Caso contrario "então", o numero é impar
     */

            count = count +1;
        } while (count < quantNumeros);
        /*
        Quando o codigo chegar a execução do 'Do" e 'While' teremos inicio ao loop
        Onde o contador 'count' deverá incicar quando o loop deve parar
        Ao sujeitar a quantidade de numeros na variavel 'quantNumeros'
         */

        System.out.println("Qauntidade de Numeros Pares: " + par);
        System.out.println("Quantidade de Numeros Impares: " + impar);
        //Mostrando ou imprimindo os Resultados
    }
}
