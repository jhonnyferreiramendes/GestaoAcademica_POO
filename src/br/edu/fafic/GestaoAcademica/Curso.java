/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.GestaoAcademica;

import br.edu.fafic.Area.Area;
import java.util.ArrayList;

/**
 *
 * @author Jhonny
 */
public class Curso {

    private String nome;
    private Area area;
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(String nome, Area area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", area=" + area + ", disciplina=" + disciplina + ", professores=" + professores + ", alunos=" + alunos + '}';
    }
    
    
    

}
