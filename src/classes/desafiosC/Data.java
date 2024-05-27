package classes.desafiosC;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(int dia1, int mes1, int ano1){
        dia = dia1;
        mes = mes1;
        ano = ano1;
    }

    Data(){
        int dia = 1;
        int mes = 1;
        int ano = 1970;
    }


    String obterDataFormatada (){
        return System.out.printf("%d/%d/%d\n", dia, mes, ano).toString();
    }

}
