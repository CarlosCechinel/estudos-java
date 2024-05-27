package Controle;

import java.util.Objects;
import java.util.Scanner;

public class DesafioDiaSemana  {
    public static void main(String[] args){
        Scanner dia = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaSemana = dia.next();
        diaSemana = diaSemana.toLowerCase();

        if (Objects.equals(diaSemana, "domingo")) {
            System.out.println("1");

        } else if (Objects.equals(diaSemana, "segunda")){
            System.out.println("2");
        }
        else if (Objects.equals(diaSemana, "terça")){
            System.out.println("3");
        }
        else if (Objects.equals(diaSemana, "quarta")){
            System.out.println("4");
        }
        else if (Objects.equals(diaSemana, "quinta")){
            System.out.println("5");
        }
        else if (Objects.equals(diaSemana, "sexta")){
            System.out.println("6");
        }
        else if (Objects.equals(diaSemana, "sábado")){
            System.out.println("7");
        }
        else {
            System.out.println("Dia inválido");
        }
        dia.close();
    }
}
