package ArraysCollections.desafios;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {

        Scanner quantidade = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = quantidade.nextInt();

        double[] notas = new double[quantidadeNotas];

        double total =0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = quantidade.nextDouble();
            total += notas[i];
        }
        System.out.println("A media do aluno é: " + total/notas.length);


        quantidade.close();
    }
}
