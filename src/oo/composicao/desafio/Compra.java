package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> items = new ArrayList<Item>();

    void addItem(Produto p, int qtdef) {
        this.items.add(new Item(p, qtdef));
    }

    void addItem(String nome,double preco, int qtdef) {
        var produto = new Produto(nome,preco);
        this.items.add(new Item(produto, qtdef));
    }

    public double getValorTotal() {
        double total =0;

        for(Item item: items)
            total += item.quantidade * item.produto.preco;
        return total;
    }
}
