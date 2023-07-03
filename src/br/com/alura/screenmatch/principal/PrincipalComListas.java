package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SplittableRandom;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme(" The Matrix",1999);
        favorito.avalia(9);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(10);
        Serie serie = new Serie("lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        Collections.sort(lista);
        System.out.println(lista);

        for (Titulo item: lista){
            System.out.println("Nome: " + item.getNome());
            if ( item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());

            }

        }

    }
}
