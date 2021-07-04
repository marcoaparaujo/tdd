package exemplo2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocacaoTest {

    @Test
    public void deveAlugarZeroFilme() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        Locacao locacao = new Locacao();
        assertEquals(0.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarUmFilme() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(10.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarDoisFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(20.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarTresFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(27.5f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarQuatroFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(32.5f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarCincoFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(35.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarSeisFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(35.0f, locacao.calcularAluguel(filmes));
    }

    @Test
    public void deveAlugarSeteFilmes() {
        Filme filme = new Filme("Os Vingadores", 10.0f);
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        filmes.add(filme);
        Locacao locacao = new Locacao();
        assertEquals(45.0f, locacao.calcularAluguel(filmes));
    }

}