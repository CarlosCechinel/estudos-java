package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Julia");

        Compra compra1 = new Compra();
        compra1.addItem(new Produto("caneta", 20), 2);
        compra1.addItem(new Produto("Borracha", 12), 3);

        Compra compra2= new Compra();
        compra2.addItem(new Produto("Caderno", 3), 1);
        compra2.addItem(new Produto("Notebool", 1000), 2);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println("Cliente: "+ cliente.nome +"\nTotal da compra: " + cliente.getValorTotal());
    }
}
