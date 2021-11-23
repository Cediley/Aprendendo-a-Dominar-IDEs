package com.company;

import java.util.Scanner;
/*
	Criando um programa, onde ele vai recerber 5 numeros
	informar o maior deles
	e a media de todos os 5
	 */

class Ex_media {

    public Ex_media(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        int contador = 0;

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;

                    contador = contador + 1;

        } while (contador < 5);

        System.out.println("O maior numero é: " + maior);
        System.out.println("A média deu: " + soma/5);

    }
}
