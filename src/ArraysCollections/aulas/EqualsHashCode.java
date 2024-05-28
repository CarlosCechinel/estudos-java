package ArraysCollections.aulas;

public class EqualsHashCode {
    public static void main(String[] args) {
        usuario u1 = new usuario();
        u1.nome= "Carlos";
        u1.email = "carlos@gmail.com";

        usuario u2 = new usuario();
        u2.nome= "Carlos";
        u2.email = "carlos@gmail.com";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u1 == u2);
    }
}
