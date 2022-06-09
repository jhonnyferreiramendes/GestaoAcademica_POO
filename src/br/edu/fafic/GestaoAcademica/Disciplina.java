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
public class Disciplina {

    private String nome;
    private Area area;
    private ArrayList<Curso> curso = new ArrayList<Curso>();

    public Disciplina(String nome, Area area) {
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

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome:" + nome + ", area:" + area +'}';
    }

    
    

}
