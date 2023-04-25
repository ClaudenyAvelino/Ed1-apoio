package vetor.estados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i=0; i < estados.length; i++){
            System.out.println("Estado "+i+" : "+estados[i]+" ");
        }

        //busca linear
        Scanner in = new Scanner(System.in);

        System.out.println("qual a sigla da Busaca ");
        String SiglaBusca = in.nextLine();
        //busca
        boolean encontrou = false;
        for (int i=0; i < estados.length; i++){
            String elemento = estados[i];
            if (elemento.equalsIgnoreCase(SiglaBusca)){
                encontrou = true;
                break;
            }
        }
        if (encontrou == true){
            System.out.println("Encontrado");
        }else {
            System.out.println("não encontrou");
        }

    }
}
