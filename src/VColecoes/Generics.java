package VColecoes;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list = new ArrayList();

        // Generic Define um tipo dado para evitar tipos de dados inesperados
        List<Integer> listGeneric = new ArrayList<>();
        listGeneric.add(11);
    }
}
