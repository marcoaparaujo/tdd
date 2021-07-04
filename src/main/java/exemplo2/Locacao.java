package exemplo2;

import java.util.List;

public class Locacao {

    public double calcularAluguel(List<Filme> filmes) {
        double valor = 0;

        for (int i = 0; i < filmes.size(); i++) {
            if (i == 2) {
                valor += filmes.get(i).getPreco() * 0.75;
            } else if (i == 3) {
                valor += filmes.get(i).getPreco() * 0.50;
            } else if (i == 4) {
                valor += filmes.get(i).getPreco() * 0.25;
            } else if (i == 5) {
                valor += 0.0;
            } else {
                valor += filmes.get(i).getPreco();
            }
        }
        return valor;
    }
}
