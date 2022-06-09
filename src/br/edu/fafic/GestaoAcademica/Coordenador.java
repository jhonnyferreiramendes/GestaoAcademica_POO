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
public class Coordenador extends Pessoa {

    protected double salario;

    public Coordenador(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
