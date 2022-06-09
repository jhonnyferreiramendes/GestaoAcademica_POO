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
public class Professor extends Pessoa {

    protected ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

}
