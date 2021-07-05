package exemplo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocacaoTest {

    private Filme filme;
    private List<Filme> filmes;
    private Locacao locacao;

    @BeforeEach
    void setUp() {
        filmes = new ArrayList<Filme>();
        filme = new Filme("Os Vingadores", 10.0f);
        locacao = new Locacao();
    }

    @Test
    void deveAlugarZeroFilme() {
        assertEquals(0.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarUmFilme() {
        filmes.add(filme);
        assertEquals(10.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarDoisFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(20.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarTresFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(27.5f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarQuatroFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(32.5f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarCincoFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(35.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarSeisFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(35.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    void deveAlugarSeteFilmes() {
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        assertEquals(45.0f, locacao.calcularAluguel(filmes));
    }

}