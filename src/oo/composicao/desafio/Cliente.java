package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    int idade;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void adicionarCompra(Compra compra) {
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
