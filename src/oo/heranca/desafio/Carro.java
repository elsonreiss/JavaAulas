package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidade;
    int delta = 30;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if(velocidade + delta > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += delta;
        }
    }

    void freiar() {
        if(velocidade >= delta) {
            velocidade -= delta;
        } else {
            velocidade = 0;
        }
    }
}
