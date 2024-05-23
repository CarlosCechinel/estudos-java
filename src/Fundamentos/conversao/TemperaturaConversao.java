package Fundamentos.conversao;

public class TemperaturaConversao {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        final double diff = 32;
        final double fator = 5.0/9;
        var F = 86;
        var C = (F - diff) * fator;

        System.out.println("C = " + C + "°C");

    }
}
