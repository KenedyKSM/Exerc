package Exerc3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retangulo:");
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retangulo");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A area do retangulo de base %s e altura %s e %s \n", base, altura, area);
    }
}
/*
 Escreva um codigo que receba a base a altura de um retangulo, calcule sua area e exiba na tela

 - formula: area = base X altura
 */