package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.acelerar();
        carro1.acelerar();
        carro1.freiar();
        carro1.freiar();
        carro1.freiar();
        System.out.println(carro1.velocidade);
    }
}
