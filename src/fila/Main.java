package fila;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enfileirar(new No("primeiro"));
        minhaFila.enfileirar(new No("segundo"));
        minhaFila.enfileirar(new No("terceiro"));
        minhaFila.enfileirar(new No("quarto"));
        System.out.println(minhaFila);

        System.out.println(minhaFila.desenfileirar());
        System.out.println(minhaFila);
        minhaFila.enfileirar(new No("ultimo"));


        System.out.println(minhaFila);

        System.out.println(minhaFila.primeiro());
        System.out.println(minhaFila);
    }
}
