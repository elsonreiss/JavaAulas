package oo.heranca.desafio;

public class Palio extends Carro {

    Palio(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    Palio() {
        this(400);
    }

    @Override
    void acelerar() {
        super.acelerar();
    }

    @Override
    void freiar() {
        super.freiar();
    }
}
