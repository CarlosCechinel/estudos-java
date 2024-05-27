package Fundamentos.desafios;

public class DesafioFor {
    public static void main(String[] args) {
        int i = 10;

        for (; i >= 0; i=i - 2){
            // quando declara uma variavel dentro do parenteses do for ela apenas é visivel dentro do escopo FOR
            System.out.println(i);
        }

    }
}
