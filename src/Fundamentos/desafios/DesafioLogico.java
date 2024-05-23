package Fundamentos.desafios;

public class DesafioLogico {
    public static void main(String[] args) {
        // trabalho na terca v ou f
        // trabalho na quinta v ou f
        // se um trabalho der certo a tv a ser comprada e de 32, caso as duas 1 de 50
        // nos dois casos a familia vai tomar sorvete

        boolean t1 = false;
        boolean t2 = false;

        if (t1 && t2){
            System.out.println("Comprou TV 50 polegadas e tomou sorvete");
        }
        else if (t1 || t2){
            System.out.println("Comprou TV 32 polegadas e tomou sorvete");
        }
        else{
            System.out.println("Nao comprou TV e nem tomou sorvete");
        }
    }
}
