package VColecoes;

import java.util.ArrayList;

public class Introducao {
    public static void main(String[] args) {
        int[] arr = new int[5000];

        ArrayList arrList = new ArrayList();
        arrList.add("lista");
        arrList.add(1);
        arrList.add(true);

        for(Object a: arrList){
            System.out.println(a);
        }

        for(int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }

        arrList.remove(0);
        arrList.remove(1);
        arrList.remove(0);

        arrList.size();
        arrList.isEmpty();
        arrList.contains(3);
        arrList.clear();



    }
}
