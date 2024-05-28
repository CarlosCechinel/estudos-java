package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Itens> itens = new ArrayList<Itens>();

    double getValorTotal() {
        double total =0;

        for(Itens item: itens)
            total += item.quantidade * item.preco;
        return total;
    }
}
