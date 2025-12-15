package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("reis");

        Compra cp = new Compra();
        cp.adicionarItem("caneta",12.0,3);
        cp.adicionarItem(new Produto("elson",2.0),5);

        c1.compras.add(cp);
        c1.adicionarCompra(cp);

        System.out.println(c1.obterValorTotal());

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
