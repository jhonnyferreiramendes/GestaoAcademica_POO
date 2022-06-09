/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.GestaoAcademica;

/**
 *
 * @author Jhonny
 */
public class Aluno extends Pessoa {
    
    protected Curso curso;
    protected Boletim boletim;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }

   
    
    
    
}
