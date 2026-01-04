package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo c1 = new Soma();
        System.out.println(c1.executar(2,5));

        c1 = new Multiplicar();
        System.out.println(c1.executar(2,5));








    }
}
