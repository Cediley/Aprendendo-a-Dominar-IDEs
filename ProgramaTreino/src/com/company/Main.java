package com.company;

import java.util.Scanner;

public class Main {
/*treinando repetições no intellij
Utilizando nome e idade
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){

            System.out.println("nome:");
            nome= scan.next();
            if (nome.equals("0")) break;
            //O comando vai parar de rodar quando digitar '0' em nome
            System.out.println("idade:");
            idade = scan.nextInt();
        }

    }
}
