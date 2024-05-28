package ArraysCollections.aulas;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entada = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int quantidadeAlunos = entada.nextInt();
        System.out.println("Digite a quantidade de notas por aluno: ");
        int quantidadeNotas = entada.nextInt();

        double [][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];

        double total=0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n=0 ; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d no aluno %d: ", (n+1),(a+1));
                notasDaTurma[a][n] = entada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total/ (quantidadeAlunos*quantidadeNotas);
        System.out.println("a média da turma é: "+ media);

    }
}
