package oo.heranca;

public class Heroi extends Jogador {

    Heroi(int s, int n) {
        super(s, n);
    }


    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }

}
