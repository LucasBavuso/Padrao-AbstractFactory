package com.example;

class PortuguesFactory implements AvaliacaoFactory {
    public Enunciado criarEnunciado() { 
        return new EnunciadoPortugues(); 
    }
    public Correcao criarCorrecao() { 
        return new CorrecaoPortugues(); 
    }
}