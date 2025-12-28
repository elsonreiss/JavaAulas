package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    private int velocidade;
    private int delta = 30;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if(velocidade + getDelta() > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += getDelta();
        }
    }

    public void freiar() {
        if(velocidade >= getDelta()) {
            velocidade -= getDelta();
        } else {
            velocidade = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
