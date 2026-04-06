package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AlunoTest {

    @Test
    void deveExibirEnunciadoMatematica() {
        AvaliacaoFactory fabrica = new MatematicaFactory();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Enunciado Matemática", aluno.exibirEnunciado());
    }

    @Test
    void deveExibirEnunciadoPortugues() {
        AvaliacaoFactory fabrica = new PortuguesFactory();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Enunciado Português", aluno.exibirEnunciado());
    }

    @Test
    void deveExibirCorrecaoMatematica() {
        AvaliacaoFactory fabrica = new MatematicaFactory();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Correção Matemática", aluno.exibirCorrecao());
    }

    @Test
    void deveExibirCorrecaoPortugues() {
        AvaliacaoFactory fabrica = new PortuguesFactory();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Correção Português", aluno.exibirCorrecao());
    }

}