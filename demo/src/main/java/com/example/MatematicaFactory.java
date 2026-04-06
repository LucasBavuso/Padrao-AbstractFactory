package com.example;

class MatematicaFactory implements AvaliacaoFactory {
    public Enunciado criarEnunciado() { 
        return new EnunciadoMatematica(); 
    }
    public Correcao criarCorrecao() { 
        return new CorrecaoMatematica(); 
    }
}