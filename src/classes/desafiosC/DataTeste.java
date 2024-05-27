package classes.desafiosC;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = 10;
        d1.ano = 2020;

        Data d2 = new Data(31, 12, 2023);


        System.out.printf(d1.obterDataFormatada());
        System.out.printf(d2.obterDataFormatada());
    }
}
