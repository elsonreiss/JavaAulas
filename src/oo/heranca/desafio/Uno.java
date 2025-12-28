package oo.heranca.desafio;

public class Uno extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    Uno() {
        super(200);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void freiar() {
        super.freiar();
    }

    @Override
    public void ligarTurbo() {
         ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void DesligarAr() {
        ligarAr = false;
    }

    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 60;
        } else if(ligarTurbo && ligarAr) {
            return 50;
        } else if(!ligarTurbo && !ligarAr) {
            return 40;
        } else {
            return 30;
        }
    }
}
