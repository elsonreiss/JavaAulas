package oo.heranca.desafio;

public class Carro {

    int velocidade = 0;

    void acelerar() {
            velocidade += 30;
    }

    void freiar() {
        if(velocidade >= 30) {
            velocidade -= 30;
        } else {
            velocidade = 0;
        }
    }
}
