/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.GestaoAcademica;

import br.edu.fafic.Area.Area;
import static br.edu.fafic.Area.Area.EXATAS;
import java.util.ArrayList;

/**
 *
 * @author Jhonny
 */
public class GestaoAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computacao", Area.EXATAS);
        Curso curso2 = new Curso("Filosofia", Area.HUMANAS);
        Curso curso3 = new Curso("Contabeis", Area.EXATAS);

        Disciplina disciplinaES = new Disciplina("Engenharia de Software", Area.EXATAS);
        Disciplina disciplinaPOO = new Disciplina("POO", Area.EXATAS);
        Disciplina disciplinaCauculo = new Disciplina("Cauculo", Area.EXATAS);
        Disciplina disciplinaPDI = new Disciplina("Processamento de Imagem e Visão Computacional", Area.EXATAS);

        Disciplina disciplinaIntroFilosofia = new Disciplina("Introdução a Filosofia", Area.HUMANAS);

        DisciplinaNota notasES = new DisciplinaNota(disciplinaES);
        notasES.getNotas().add(10.0);
        notasES.getNotas().add(5.0);
        notasES.getNotas().add(9.0);
        
        DisciplinaNota notasPOO = new DisciplinaNota(disciplinaPOO);
        notasPOO.getNotas().add(9.0);
        notasPOO.getNotas().add(9.5);
        notasPOO.getNotas().add(9.0);
        
        DisciplinaNota notasCauculo = new DisciplinaNota(disciplinaCauculo);
        notasCauculo.getNotas().add(10.0);
        notasCauculo.getNotas().add(9.5);
        notasCauculo.getNotas().add(7.0);
        
        DisciplinaNota notasPDI = new DisciplinaNota(disciplinaPDI);
        notasPDI.getNotas().add(10.0);
        notasPDI.getNotas().add(9.5);
        notasPDI.getNotas().add(10.0);
        

        DisciplinaNota notasIntroFilosofia = new DisciplinaNota(disciplinaIntroFilosofia);
        notasIntroFilosofia.getNotas().add(9.0);
        notasIntroFilosofia.getNotas().add(8.0);
        notasIntroFilosofia.getNotas().add(9.5);

        Coordenador coordenadoraMaria = new Coordenador("Maria", "987.654.123-35", "0142");
        coordenadoraMaria.setSalario(8000.00);
        Coordenador coordenadorPedro = new Coordenador("Pedro", "789.456.321-53", "2410");
        coordenadorPedro.setSalario(6000.00);

        Aluno alunoJose = new Aluno("José", "432.658.147-35", "7546");
        Aluno alunoJhonny = new Aluno("Jhonny", "084.870.694-36", "3636");
        Aluno alunoDanilo = new Aluno("Danilo", "111.222.333-45", "3586");

        Aluno alunaCris = new Aluno("Cris", "854.458.321-78", "2211");

        Professor professorLuciano = new Professor("Luciano", "897.478.587.31", "4876");
        Professor professoraAntonia = new Professor("Antonia", "777.978.507.81", "4876");
        Professor professorCarlos = new Professor("Carlos", "888.778.887.81", "4886");

        Professor professorClaudio = new Professor("Claudio", "147,741,456-339", "5878");

        curso1.getDisciplina().add(disciplinaES);
        curso1.getDisciplina().add(disciplinaPOO);
        curso1.getDisciplina().add(disciplinaCauculo);
        curso1.getDisciplina().add(disciplinaPDI);

        curso1.getProfessores().add(professorLuciano);
        curso1.getProfessores().add(professoraAntonia);
        curso1.getProfessores().add(professorCarlos);

        curso1.getAlunos().add(alunoJose);
        curso1.getAlunos().add(alunoJhonny);
        curso1.getAlunos().add(alunoDanilo);

        curso2.getDisciplina().add(disciplinaIntroFilosofia);
        curso2.getProfessores().add(professorClaudio);
        curso2.getAlunos().add(alunaCris);

        Boletim boletimJose = new Boletim(alunoJose);
        boletimJose.getDisciplina().add(disciplinaES);
        Boletim boletimPOO = new Boletim(alunoJose);
        boletimJose.getDisciplina().add(disciplinaPOO);
        Boletim boletimCauculo = new Boletim(alunoJose);
        boletimJose.getDisciplina().add(disciplinaCauculo);
        Boletim boletimPDI = new Boletim(alunoJose);
        boletimJose.getDisciplina().add(disciplinaPDI);
        
        
        
        Boletim boletimCris = new Boletim(alunaCris);
        boletimCris.getDisciplina().add(disciplinaIntroFilosofia);

        System.out.println(curso1);
        System.out.println("Coordenador(a):" + coordenadoraMaria + " Salario: " + coordenadoraMaria.getSalario() + "$" + " " + curso1.getNome());
        System.out.println("Alunos: " + alunoJose + alunoJhonny + alunoDanilo);
        System.out.println(disciplinaES + " " + curso1.getNome());
        System.out.println("Area: " + Area.EXATAS);
        System.out.println("Profesores: " + professorLuciano + " " + disciplinaES + " " + disciplinaPOO + " " + curso1.getNome() + " " + Area.EXATAS + " " + professoraAntonia + " " + disciplinaCauculo + " " + curso1.getNome() + " " + Area.EXATAS + " " + professorCarlos + " " + disciplinaPDI + " " + curso1.getNome() + " " + Area.EXATAS);
        System.out.println(boletimJose + "" + notasES + " " + boletimPOO + "" + notasPOO + boletimCauculo + "" + notasCauculo + " " + boletimPDI + "" + notasPDI);

        System.out.println("\n****************************************************************************************************************************************************************************************\n");

        System.out.println(curso2);
        System.out.println("Coordenador(a):" + coordenadorPedro + " Salario: " + coordenadorPedro.getSalario() + "$" + " " + curso2.getNome());
        System.out.println("Aluna: " + alunaCris);
        System.out.println(disciplinaIntroFilosofia + " " + curso2.getNome());
        System.out.println(Area.HUMANAS);
        System.out.println("Professor: " + professorClaudio + " " + disciplinaIntroFilosofia);
        System.out.println(boletimCris + "" + notasIntroFilosofia);

    }

}
