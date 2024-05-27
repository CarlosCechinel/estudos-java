package classes.aula;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.Nome = "Notebook";
        p1.preco = 4356.89;

        var p2 = new Produto();
        p2.Nome = "Celular";
        p2.preco = 1200.00;


        System.out.println(p1.precoFinal(0.30));
    }
}
