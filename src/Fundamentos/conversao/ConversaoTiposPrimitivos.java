package Fundamentos.conversao;

public class ConversaoTiposPrimitivos {
    private static void main(String[] args){
        double a = 1; //conversao implicita
        System.out.println(a);

        float b = (float) 2.781962763; //explicita pois o numero em sequencia nao e do tipo float
        System.out.println(b);

    }
}
