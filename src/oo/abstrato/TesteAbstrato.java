package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        System.out.println(cao.mamar());
        System.out.println(cao.mover());
        System.out.println(cao.respirar());
    }
}
