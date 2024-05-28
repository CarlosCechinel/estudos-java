package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente= "Carlos";
        compra1.itens.add(new Itens("caneta", 20,7.45));
        compra1.itens.add(new Itens("Borracha", 12,3.89));
        compra1.itens.add(new Itens("Caderno", 3,18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
    }
}
