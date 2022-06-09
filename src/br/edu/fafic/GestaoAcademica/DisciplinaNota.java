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
public class DisciplinaNota {

    private Disciplina disciplina;
    private ArrayList<Double> notas = new ArrayList<Double>();

    public DisciplinaNota(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "{" + disciplina + ", notas=" + notas + '}';
    }

}
