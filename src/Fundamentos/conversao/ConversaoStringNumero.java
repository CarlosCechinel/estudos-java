package Fundamentos.conversao;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args){
        String s = JOptionPane.showInputDialog(
                "Digite o primeiro numero:");
        String s2 = JOptionPane.showInputDialog(
                "Digite o segundo numero:");

        double n1 = Double.parseDouble(s);
        double n2 = Double.parseDouble(s2);

        double soma = n1+n2;

        System.out.println("soma: " + soma);
    }
}
