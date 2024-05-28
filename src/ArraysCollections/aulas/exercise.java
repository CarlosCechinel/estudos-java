package ArraysCollections.aulas;

import java.util.Arrays;

public class exercise {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[3];
        notasAlunoA[0] = 1.9;
        notasAlunoA[1] = 8.9;
        notasAlunoA[2] = 9.9;

        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total/notasAlunoA.length);
    }

}
