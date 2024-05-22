package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Bom dia";
        System.out.println(s);

        System.out.println(s.concat("!!!!"));
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.endsWith("dia"));
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.equals("Bom dia"));


        var nome = "Carlos";
        var sobrenome = "Cechinel";
        var idade = 29;
        var salario = 12000;

        System.out.printf("Nome: %s %s\n",nome, sobrenome);
        System.out.println(idade);
    }
}
