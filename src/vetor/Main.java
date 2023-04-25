package vetor;

public class Main {
    public static void main(String[] args) {
        int[] vetorG = new int[10];

//        vetorG[0]=3;
//        vetorG[1]=4;
//        vetorG[2]=8;
//        vetorG[3]=13;
//        vetorG[4]=22;
//        vetorG[5]=51;
//        vetorG[6]=33;
        System.out.println("imprimindo...");
        //vetor na posição [0]=3
        System.out.println(vetorG[0]);

        for (int i=0; i < vetorG.length; i++){
            System.out.print("["+vetorG[i]+"]");
        }
    }
}
