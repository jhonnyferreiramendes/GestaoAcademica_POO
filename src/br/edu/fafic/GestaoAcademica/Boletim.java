/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.GestaoAcademica;

import java.util.ArrayList;

/**
 *
 * @author Jhonny
 */
public class Boletim {

    private Aluno aluno;
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

    public Boletim(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Boletim{" + "aluno=" + aluno + '}';
    }
    
    

}
