package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioWhile  {
    public static void main(String[] args) {

        int quantidade = 0;
        double nota = 0;
        double somaNota = 0;
        double media = 0;
        Scanner scanner = new Scanner(System.in);


       while (nota != -1) {
            System.out.println("Digite uma nota: ");
            nota = scanner.nextDouble();

            if (nota >= 0 || nota <= 10) {
                somaNota += nota;
                quantidade++;
            }
        };

        if (quantidade > 0) {
            media = somaNota / quantidade;
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}