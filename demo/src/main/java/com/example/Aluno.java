package com.example;

public class Aluno {

    private Enunciado Enunciado;
    private Correcao Correcao;

    public Aluno (AvaliacaoFactory fabrica) {
        this.Enunciado = fabrica.criarEnunciado();
        this.Correcao = fabrica.criarCorrecao();
    }

    public String exibirEnunciado() {
        return this.Enunciado.exibir();
    }

    public String exibirCorrecao() {
        return this.Correcao.exibir();
    }
}