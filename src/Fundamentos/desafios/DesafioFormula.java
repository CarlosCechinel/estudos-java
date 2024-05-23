package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioFormula {
    public static void main(String[] args) {
        Scanner numerous = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = numerous.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNumero = numerous.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = numerous.nextInt();
        System.out.print("Digite o quarto numero: ");
        int quartoNumero = numerous.nextInt();
        System.out.print("Digite o quinto numero: ");
        int quintoNumero = numerous.nextInt();
        System.out.print("Digite o sexto numero: ");
        int sextoNumero = numerous.nextInt();
        System.out.print("Digite o setimo numero: ");
        int setimoNumero = numerous.nextInt();
        System.out.print("Digite o oitavo numero: ");
        int oitavoNumero = numerous.nextInt();
        System.out.print("Digite o nono numero: ");
        int nonoNumero = numerous.nextInt();

        int x = primeiroNumero*(segundoNumero+terceiroNumero);
        int x2 = (int) Math.pow(x,2);
        System.out.println(x2);

        int x3 = x2/(quartoNumero*quintoNumero);

        int y = (sextoNumero-setimoNumero)*(oitavoNumero-nonoNumero);
        int y2 = y/2;
        int y3 = (int) Math.pow(y2,2);

        int z = x3-y3;
        int z1 = (int) Math.pow(z,3);

        int a = (int) Math.pow(10,3);

        int fim = (int) z1/a;
        System.out.println(fim);

        numerous.close();




    }
}
