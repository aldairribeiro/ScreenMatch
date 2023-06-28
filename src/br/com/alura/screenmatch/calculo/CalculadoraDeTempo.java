package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

import java.io.File;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
    public int getTempoTotal() {
        return tempoTotal;
    }
}
