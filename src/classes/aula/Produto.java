package classes.aula;

public class Produto {

    String Nome;
    double preco;
    static double desconto = 0.25;

    double precoFinal() {
        return preco * (1 - desconto);
    }

    double precoFinal(double descontPlus) {
        desconto = descontPlus;
        return preco * (1 - desconto);
    }

}
