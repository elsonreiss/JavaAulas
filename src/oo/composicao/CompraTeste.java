package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.nomeCliente = "Reis";
        c1.itens.add(new Item("Mouse",1,100.00));
        c1.itens.add(new Item("Luva",1,100.00));
        c1.itens.add(new Item("Caneta",1,100.00));

        System.out.println(c1.itens.size());
        System.out.println(c1.valorTotal());

        double total = c1.itens.get(0).compra.itens.get(1).compra.valorTotal();
        System.out.println(total);

        System.out.println();

    }
}
