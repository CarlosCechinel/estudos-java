package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entradas.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entradas.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = entradas.nextInt();


        System.out.printf("%s %s tem %d anos de idade", nome, sobrenome,idade);
    }
}
