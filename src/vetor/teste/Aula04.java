package vetor.teste;

import vetor.aula01.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            System.out.println("Tamanho do Vetor :\n"+vetor.tamanho());
       System.out.println("Elementos do vetor :\n"+vetor.toString());
    }

}
