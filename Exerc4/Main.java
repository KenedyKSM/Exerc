package Exerc4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o nome da primeira pessoa:");
        var name1 = scanner.next();
        System.out.println("Informe o nome da segunda pessoa:");
        var name2 = scanner.next();
        System.out.println("Informe a idade da primeira pessoa:");
        var age1 = scanner.nextInt();
        System.out.println("informe a idade da segunda pessoa:");
        var age2 = scanner.nextInt();
        var differentAge = Math.abs(age1 - age2);
        System.out.printf("A diferenca de idade entre %s e %s e de %s anos \n", name1, name2, differentAge);
    }
}
/*
 Escreva um codigo que receba o nome e a idade de 2 pessoas e imprima a diferenca de idade entre elas
 */
