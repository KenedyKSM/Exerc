package Exerc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado:");
        var side = scanner.nextInt();
        var area = side * side;
        System.out.printf("A area do quadrado de lado %s e %s \n", side, area);
    }
    
}

/*
 Escreva um codigo que receba o tamanho do lado do quadrado, calcule sua area e exiba na tela

 - formula: area = lado X lado
 */