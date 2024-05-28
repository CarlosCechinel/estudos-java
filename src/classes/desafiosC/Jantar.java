package classes.desafiosC;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.15);
        Comida c3 = new Comida("Bife", 0.2);
        Comida c4 = new Comida("Batata frita", 0.2);

        Pessoa p1 = new Pessoa("João", 80.0);
        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());
    }
}