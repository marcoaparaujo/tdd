package exemplo2;

import java.util.List;

public class Locacao {

    public float calcularAluguel(List<Filme> filmes) {
        float valor = 0.0f;
        for (int i = 0; i < filmes.size(); i++) {
            if (i == 2) {
                valor += filmes.get(i).getPreco() * 0.75f;
            } else if (i == 3) {
                valor += filmes.get(i).getPreco() * 0.50f;
            } else if (i == 4) {
                valor += filmes.get(i).getPreco() * 0.25f;
            } else if (i == 5) {
                valor += 0.0f;
            } else {
                valor += filmes.get(i).getPreco();
            }
        }
        return valor;
    }
}
