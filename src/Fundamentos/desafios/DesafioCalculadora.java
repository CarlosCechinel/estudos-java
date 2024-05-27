package Fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // ler numero 1
        // ler numero 2
        // ler operador
        // mostrar resultado

        Scanner n = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = Integer.parseInt(n.nextLine());
        System.out.println("Digite o segundo numero: ");
        int n2 = Integer.parseInt(n.nextLine());
        System.out.println("Digite o operador: ");
        String op = n.nextLine();

      if (op.equals("-")){
          System.out.println(n1-n2);
      }
      else if (op.equals("+")){
          System.out.println(n1+n2);
      }
      else if (op.equals("*")){
          System.out.println(n1*n2);
      }
      else if (op.equals("/")){
          System.out.println(n1/n2);
      }
    }
}
