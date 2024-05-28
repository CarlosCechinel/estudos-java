package oo.composicao;

import java.util.List;
import java.util.ArrayList;

public class Curso {

    String nome;
    List<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome){
        this.nome = nome;
    }

    void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
