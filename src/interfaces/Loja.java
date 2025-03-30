package interfaces;

import models.Jogo;

public interface Loja {
    public void comprarJogo(Jogo j);
    public void avaliarJogo(Jogo j, int estrela);
    public void jogar(Jogo j, int horas);
}
