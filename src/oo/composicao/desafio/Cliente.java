package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    int idade;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome, int idade) {
        this.nome = nome;
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("A idade deve ser maior que zero!");// Lançando uma Exceção (Profissional)
            //Esta é a prática padrão no mercado. Se o valor for inválido, o programa gera um erro específico que obriga quem está usando a classe a corrigir o problema.
            //System.out.println("A idade deve ser maior que zero!");
        }
        this.idade = idade;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
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
