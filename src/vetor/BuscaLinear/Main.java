package vetor.BuscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        System.out.println("vetor :");
        for (int i=0; i < vetor.length;i++){
            vetor[i] = (int) (Math.random() * 10);

            System.out.print(vetor[i]+" ");
        }
        System.out.println("\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Qual valor você que buscar !");
        int buscado = in.nextInt();
        boolean existe = false;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == buscado){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("EXISTE!");
        }else {
            System.out.println("NÃO EXISTE!");
        }

    }
}
