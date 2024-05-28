package classes.desafiosC;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    double comer (Comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
        return this.peso;
    }

    String apresentar(){
        return "Olá, meu nome é " + this.nome + " e eu peso " + this.peso + "Kgs";
    }

}
