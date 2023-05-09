package vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);
        arrayList.add(1, "B");
        System.out.println(arrayList);

       boolean  existe = arrayList.contains("W");
       if (existe){
           System.out.println("elemento existe");
       }else {
           System.out.println("elemento nãp existe");
       }

       int pos = arrayList.indexOf("D");
        if (pos > -1){
            System.out.println("elemento existe"+pos);
        }else {
            System.out.println("elemento não existe"+pos);
        }

    }
}
