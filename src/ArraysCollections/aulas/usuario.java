package ArraysCollections.aulas;

public class usuario {

    String nome;
    String email;

    public boolean equals(Object obj) {

        if (obj instanceof usuario) {
            usuario other = (usuario) obj;

            boolean equal = other.nome.equals(this.nome);
            boolean equals = other.email.equals(this.email);
            return equals && equal;
        } else
            return false;
    }
    public int hashCode() {
        return this.nome.hashCode() + this.email.hashCode();
    }
}
