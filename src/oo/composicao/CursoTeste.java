package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Jose");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Python");
        Curso curso3 = new Curso("Oracle");

        curso3.addAluno(aluno1);
        curso3.addAluno(aluno2);
        curso3.addAluno(aluno3);

        curso1.addAluno(aluno2);
        curso1.addAluno(aluno1);

        curso2.addAluno(aluno3);

        for (Aluno aluno : curso1.alunos){
        System.out.println("Meu nome é: "+ aluno.nome + " e estou matriculado no curso : " + curso1.nome);
        }
    }
}
