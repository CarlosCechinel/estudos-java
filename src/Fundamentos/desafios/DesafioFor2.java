package Fundamentos.desafios;

public class DesafioFor2   {
    public static void main(String[] args){

        String valor = "#";
        for (String i = "#"; !i.equals("######") ; i = i + "#") {
            System.out.println(valor);
            valor = valor + "#";
        }
    }

}
