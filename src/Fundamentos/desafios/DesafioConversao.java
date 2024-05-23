package Fundamentos.desafios;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args){
        Scanner salary = new Scanner(System.in);
        System.out.print("Digite seu ultimo salario: ");
        String ultimoSalario = salary.nextLine();
        System.out.print("Digite seu penultimo saladrio: ");
        String penultimoSalario = salary.nextLine();
        System.out.print("Digite seu antepenultimo salario: ");
        String antepenultimoSalario = salary.nextLine();

        double ultimo = parseDouble(ultimoSalario);
        double penultimo = parseDouble(penultimoSalario);
        double antepenultimo = parseDouble(antepenultimoSalario);

        double media = (ultimo+penultimo+antepenultimo)/3;

        System.out.printf("Sua media de salario é de: %.2f", media);

        salary.close();

    }

    private static double parseDouble(String input) {
        Locale locale = new Locale("pt", "BR"); // Set the locale to Brazilian Portuguese
        NumberFormat formatter = NumberFormat.getInstance(locale);
        try {
            return formatter.parse(input).doubleValue();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input);
            return 0.0;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}