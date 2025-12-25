package oo.heranca;

public class Heroi extends Jogador {

    boolean atacar(Jogador oponente) {
        int deltaS = Math.abs(s - oponente.s);
        int deltaN = Math.abs(n - oponente.n);

        if(deltaS == 0 && deltaN == 1) {
            oponente.vida -= 15;
            return true;
        } else if (deltaS == 1 && deltaN == 0) {
            oponente.vida -= 15;
            return true;
        } else {
            return false;
        }
    }

}
