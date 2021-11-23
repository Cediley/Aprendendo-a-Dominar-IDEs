package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
	/*
	Criar um projeto, onde um laço de repetição vai pedir uma nota
	essa nota deve ser de '0 a 10' ou o sistema vai pedir pra redigitar a nota
	 */
        int nota;

        System.out.println("nota: ");
        nota = scan.nextInt();

        while (nota <  0  | nota > 10){
            System.out.println("Nota invalida, tente outra: ");
            nota = scan.nextInt();
        }
    }
}
