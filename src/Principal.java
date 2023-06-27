import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.io.Serial;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome(" The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações  do filme: " +favorito.pegaMedia());

        Serie serie = new Serie();
    }
}