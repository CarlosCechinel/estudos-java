package Controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "vermelho";

        switch (faixa.toLowerCase()) {
            case "preto":
                System.out.println("Sei Bassai dai");

            case "branco":
                System.out.println("sei tkki shodan");

            case "amarelo":
                System.out.println("se Heidan");

            case "vermelho":
                System.out.println("Sei Nida");

            case "verde":
                System.out.println("Sei Shodan");

            default:
                System.out.println("Não identificado");

        }
    }
}
